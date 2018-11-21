package my.example.breadshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(){
        return "index";
    }
}
