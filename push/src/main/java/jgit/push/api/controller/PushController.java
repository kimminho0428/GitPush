package jgit.push.api.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import jgit.push.api.controller.request.GitPushRequest;
import jgit.push.api.service.GitService;
import jgit.push.domain.dto.GitInfoDto;
import jgit.push.domain.dto.PushList;
import jgit.push.domain.entity.GitInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
public class PushController {

    private final GitService gitService;

    @GetMapping("/push/new")
    public String createForm(Model model) {
        model.addAttribute("PushForm", new PushForm());
        return "push/createPushForm";
    }

    @PostMapping("/push/new")
    public String createPush(@Valid @ModelAttribute("PushForm") PushForm form, BindingResult result) throws GitAPIException, IOException, URISyntaxException {

        if (result.hasErrors()) {
            return "push/createPushForm";
        }

        GitPushRequest request = new GitPushRequest(
                form.getLocalpath(),
                form.getUrl(),
                form.getUsername(),
                form.getToken(),
                form.getMessage()
        );

        gitService.pushGithub(request);
        gitService.saveGitPushInfo(request);

        return "redirect:/";
    }

    @PostMapping("/push/check-repository")
    @ResponseBody
    public Map<String, String> checkGitRepositoryAjax(@RequestBody GitPushRequest request){
        return gitService.checkGitRepository(request);
    }

    @GetMapping("/pushlist")
    public String list(Model model) {
        List<PushList> pushlist = gitService.findPushList();
        model.addAttribute("pushlist", pushlist);
        return "push/pushList";
    }

    @GetMapping("/push/search")
    public String searchGitPushInfoForm(Model model) {
        model.addAttribute("SearchForm", new SearchForm());
        return "push/searchPushForm";
    }

    @PostMapping("/push/search")
    public String searchGitPushInfo(@ModelAttribute("SearchForm") SearchForm searchForm, Model model) {
        String username = searchForm.getUsername();
        List<PushList> pushlist = gitService.findPushListByName(username);
        model.addAttribute("pushlist", pushlist);

        return "push/pushlistAddUpdate";

    }

    @GetMapping("/push/edit")
    public String editGitRepository(@RequestParam("username") String username,
                                    @RequestParam("url") String url,
                                    Model model) {
        GitInfoDto gitInfo = gitService.findByNameAndUrl(username, url);
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

    @DeleteMapping("/pushlist/delete/{id}")
    public ResponseEntity<Void> deletePushList(@PathVariable("id") Long id){
        gitService.deletePushList(id);
        return ResponseEntity.ok().build();
    }


}
