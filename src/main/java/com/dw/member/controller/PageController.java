package com.dw.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller 페이지 이동!!!
@Controller
public class PageController {

    @GetMapping("/join")
    public String loadJoinPage() {
        return "join";
    }

    @GetMapping("/login")
    public String loadLoginPage() {
        return "recap_login";
    }

    @GetMapping("/home")
    public String loadHomePage() {
        return "index";
    }
}
