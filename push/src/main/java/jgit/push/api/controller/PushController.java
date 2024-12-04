package jgit.push.api.controller;

import jgit.push.api.controller.request.GitPushRequest;
import jgit.push.api.service.GitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.net.URISyntaxException;

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
    public String createPush(PushForm form, BindingResult result) throws GitAPIException, IOException, URISyntaxException {

        if (result.hasErrors()){
            return "push/createPushForm";
        }

        GitPushRequest request = new GitPushRequest(
                form.getUrl(),
                form.getUsername(),
                form.getToken(),
                form.getMessage()
        );


        gitService.pushGithub(request);

        return "redirect:/";
    }

}
