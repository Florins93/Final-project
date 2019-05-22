package com.sci.finalproject.demo.controller;

import com.sci.finalproject.demo.model.CustomUserDetails;
import com.sci.finalproject.demo.model.User;
import com.sci.finalproject.demo.service.ProfileService;
import com.sci.finalproject.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping(path = "/profile")
    public ModelAndView getProfileInformations(@AuthenticationPrincipal CustomUserDetails userDetails){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("profile");
        mv.addObject("profile", profileService.getProfile(userDetails.getId()));
        return mv;
    }

    @PostMapping("/profile")
    public String profileSubmit(@Valid User profile, BindingResult bindingResult, @AuthenticationPrincipal CustomUserDetails userDetails) {
        if (bindingResult.hasErrors()) {
            return "profile";
        }
        profile.setId(userDetails.getId());
        profile.setPassword(bCryptPasswordEncoder.encode(profile.getPassword()));
        profile.setPasswordConfirm(bCryptPasswordEncoder.encode(profile.getPasswordConfirm()));
        profileService.saveProfile(profile);
        return "redirect:/profile";
    }
}
