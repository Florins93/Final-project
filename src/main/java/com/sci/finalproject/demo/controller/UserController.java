package com.sci.finalproject.demo.controller;

import com.sci.finalproject.demo.model.User;
import com.sci.finalproject.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    UserService authorService;

//    @GetMapping(path = "")
//    public ModelAndView getAllUsers(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("users");
//        mv.addObject("users", authorService.getAllUsers());
//        return mv;
//    }

    @GetMapping("/add")
    public String greetingForm(Model model) {
        model.addAttribute("user", new User());
        return "add-user";
    }

    @PostMapping("/add")
    public String authorSubmit(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-user";
        }

        authorService.saveUser(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String removeAd(@RequestParam Integer id) {
        authorService.removeUserById(id);
        return "redirect:/users";
    }
}