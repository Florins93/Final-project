package com.sci.finalproject.demo.controller;


import com.mysql.cj.exceptions.ExceptionInterceptor;
import com.mysql.cj.log.Log;
import com.sci.finalproject.demo.model.CustomUserDetails;
import com.sci.finalproject.demo.model.Location;
import com.sci.finalproject.demo.model.User;
import com.sci.finalproject.demo.service.LocationService;
import com.sci.finalproject.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.IOException;
import java.sql.Blob;
import java.time.LocalDate;
import java.util.Base64;
import java.util.Properties;

@Controller
//@RequestMapping(path = "/location")
public class LocationController {

    @Autowired
    ProfileService profileService;

    @Autowired
    LocationService locationService;

    @GetMapping(path = "/location")
    public ModelAndView getLocationsInformations(@AuthenticationPrincipal CustomUserDetails userDetails) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("location");
        mv.addObject("location", profileService.getProfile(userDetails.getId()));
        return mv;
    }

    @PostMapping("/location")
    public String locationSubmit(@Valid User profile, BindingResult bindingResult, @AuthenticationPrincipal CustomUserDetails userDetails) {
        if (bindingResult.hasErrors()) {
            return "location";
        }
        profile.setId(userDetails.getId());
        profileService.saveProfile(profile);
        return "redirect:/location";
    }

    @GetMapping("/add")
    public String getAdd(Model model) {
        model.addAttribute("location", new Location());
        return "add";
    }

    @PostMapping("/location/add")

    public String addLocation(@Valid Location location, BindingResult bindingResult,
                              @RequestParam(value="photo1") MultipartFile file, @RequestParam(value="photo2") MultipartFile file2 )
    {
        if (bindingResult.hasErrors()) {
            System.out.println("error");

            return "add";
        }




        try {
            if(file != null)
                location.setPhoto1(Base64.getEncoder().encodeToString(file.getBytes()));
            if(file2 != null)
                location.setPhoto2(Base64.getEncoder().encodeToString(file2.getBytes()));

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        //la citirea din baza de date :
        String bytiCuPozaBase64 = "ABCD";//asta o scot din baza de date cumva
        byte [] rezultatFisier = Base64.getDecoder().decode(bytiCuPozaBase64);//asta e decodata. O pot pune pe ecran sub forma asta
        */


        locationService.saveLocation(location);
        return "redirect:/location";
    }

//    @PostMapping("/location/add")
//    public String locationSubmit( @ModelAttribute("location") @Valid Location location, BindingResult bindingResult,@RequestParam("uploadPhoto1") MultipartFile photo1, @RequestParam("uploadPhoto2")
//            MultipartFile photo2) {
//        if (bindingResult.hasErrors()) {
//            System.out.println(bindingResult.toString());
//            return "add";
//        }
//        try{
//            locationService.savePhoto(photo1);
//            locationService.savePhoto(photo2);
//        } catch(Exception e){
//            e.printStackTrace();
//            return "add";}
//        location.setPhoto1(photo1.getOriginalFilename());
//        location.setPhoto2(photo2.getOriginalFilename());
//        locationService.saveLocation(location);
//        return "redirect:/location";
//    }

}
