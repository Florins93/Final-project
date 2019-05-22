package com.sci.finalproject.demo.service;

import com.sci.finalproject.demo.model.ProfileRepository;
import com.sci.finalproject.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    public User getProfile(Integer id){
        return profileRepository.findById(id).get();
    }

    public User saveProfile(User user){
        return profileRepository.save(user);
    }
}
