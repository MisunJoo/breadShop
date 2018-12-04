package my.example.breadshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/members")
public class MemberController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/member/signup")
    public String signUpForm(ModelMap modelMap, @RequestParam(value = "email", defaultValue = "") String email,
                             @RequestParam(value = "nickName", defaultValue = "")String nickName,
                             @RequestParam(value = "duplication", defaultValue = "") String duplication) {
        modelMap.addAttribute("email",email);
        modelMap.addAttribute("nickName",nickName);
        modelMap.addAttribute("duplication",duplication);

        return "signup";
    }
}
