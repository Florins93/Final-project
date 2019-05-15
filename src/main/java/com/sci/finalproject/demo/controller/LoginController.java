package com.sci.finalproject.demo.controller;

import com.sci.finalproject.demo.model.User;
import com.sci.finalproject.demo.service.SecurityService;
import com.sci.finalproject.demo.service.UserService;
import com.sci.finalproject.demo.validator.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private SecurityService securityService;
    @Autowired
    private UserValidation userValidation;

    @GetMapping
    public String proiect(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Username or Password is invalid.");

        if (logout != null)
            model.addAttribute("message", "Log out!");

        return "proiect";
    }

    @GetMapping("/sign-up")
    public String signUp(Model model) {
        model.addAttribute("user", new User());
        return "sign-up";
    }

    @PostMapping("/sign-up")
    public String signUp(@Valid User user, BindingResult bindingResult) {
        userValidation.validate(user, bindingResult);
        if (bindingResult.hasErrors()) {
            return "sign-up";
        }
        user.setRole("user");
        userService.save(user);
        securityService.autoLogin(user.getUsername(), user.getPasswordConfirm());
        return "redirect:/proiect";
    }
}