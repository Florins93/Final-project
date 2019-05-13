package com.sci.finalproject.demo.service;

import com.sci.finalproject.demo.model.User;
import com.sci.finalproject.demo.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

//   public Iterable<User> getAllUsers(){
//        return userRepo.findAll();
//    }

    public User saveUser(User u){
        return userRepo.save(u);
    }

    public void removeUserById(Integer id){
        userRepo.deleteById(id);
    }
}