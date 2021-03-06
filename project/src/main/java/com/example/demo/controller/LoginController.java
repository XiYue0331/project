package com.example.demo.controller;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("login", new Login());
        return "login";

    }

    //捕获login页面Post请求，与数据库核验员工Id，密码。身份
    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute  Login login) {
        if(loginService.checkExistUid( login.getUid() )  && loginService.checkPasswd(login.getUid(), login.getPasswd(), login.getIdentity()) )
            return "loginResult";
        else
            System.out.println("Hello World");

        return "login";
    }




}
