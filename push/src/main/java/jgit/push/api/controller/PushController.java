package jgit.push.api.controller;

import jakarta.servlet.http.HttpSession;
import jgit.push.api.controller.request.GitPushRequest;
import jgit.push.api.service.GitService;
import jgit.push.domain.entity.GitInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class PushController {

    private final GitService gitService;

    @GetMapping("/push/new")
    public String createForm(Model model){
        model.addAttribute("PushForm", new PushForm());
        return "push/createPushForm";
    }
    @PostMapping("/push/new")
    public String createPush(PushForm form, BindingResult result, @RequestParam("action") String action, Model model, HttpSession session) throws GitAPIException, IOException, URISyntaxException {

        if (result.hasErrors()){
            return "push/createPushForm";
        }

        GitPushRequest request = new GitPushRequest(
                form.getLocalpath(),
                form.getUrl(),
                form.getUsername(),
                form.getToken(),
                form.getMessage()
        );

        if("Authentication".equals(action)){
            boolean isValid = gitService.checkGitRepository(request);
            if (isValid){
                session.setAttribute("isAuthenticated", true);
                model.addAttribute("message", "Git 인증 성공");
            } else {
                session.setAttribute("isAuthenticated", false);
                model.addAttribute("message", "Git 인증 실패");
            }
        } else if ("Push".equals(action)){
            Object isAuthenticated = session.getAttribute("isAuthenticated");

            if (isAuthenticated == null || !(boolean) isAuthenticated){
                model.addAttribute("message", "먼저 인증을 완료해주세요.");
                return "push/createPushForm";
            }
            gitService.pushGithub(request);
            gitService.saveGitPushInfo(request);
            return "redirect:/";
        }

        return "push/createPushForm";
    }

    @GetMapping("/pushlist")
    public String list(Model model){
        List<GitInfo> pushlist = gitService.findPushList();
        model.addAttribute("pushlist", pushlist);
        return "push/pushList";
    }

    @GetMapping("/push/search")
    public String searchGitPushInfoForm(Model model){
        model.addAttribute("SearchForm", new SearchForm());
        return "push/searchPushForm";
    }

    @PostMapping("/push/search")
    public String searchGitPushInfo(@ModelAttribute("SearchForm") SearchForm searchForm, Model model){
        String username = searchForm.getUsername();
        List<GitInfo> pushlist = gitService.findPushListByName(username);
        model.addAttribute("pushlist", pushlist);

        return "push/pushlistAddUpdate";

    }

    @GetMapping("/push/edit")
    public String editGitRepository(@RequestParam("username") String username,
                                    @RequestParam("url") String url,
                                    Model model){
        GitInfo gitInfo = gitService.findByNameAndUrl(username, url);
        UpdatePushForm updatePushForm = new UpdatePushForm(
                gitInfo.getLocalPath(),
                gitInfo.getUrl(),
                gitInfo.getUsername(),
                gitInfo.getRawToken(),
                gitInfo.getMessage()
        );
        model.addAttribute("updatePushForm", updatePushForm);
        return "push/updatePushForm";
    }

    @PostMapping("/push/edit")
    public String editGitRepository(@ModelAttribute("UpdatePushForm") UpdatePushForm updatePushForm, Model model) throws GitAPIException, IOException, URISyntaxException {
        GitPushRequest request = new GitPushRequest(
                updatePushForm.getLocalpath(),
                updatePushForm.getUrl(),
                updatePushForm.getUsername(),
                updatePushForm.getToken(),
                updatePushForm.getMessage()
        );

        gitService.pushGithub(request);
        gitService.saveGitPushInfo(request);

        return "redirect:/";
    }
}
