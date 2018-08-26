package com.example.springpostgredbsample.controller;


import com.example.springpostgredbsample.Factory.UserDataFactory;
import com.example.springpostgredbsample.model.UserEvaluationRepository;
import com.example.springpostgredbsample.model.UserResponseResource;
import com.example.springpostgredbsample.model.Userdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserEvaluationController {

    @Autowired
    UserEvaluationRepository userEvaluationRepository;

    @RequestMapping(value = "/userDatas/{userId}",method = RequestMethod.GET)
    public UserResponseResource getUserData(@PathVariable int userId){
        Userdata userData = userEvaluationRepository.findByUserid(userId);
        return UserDataFactory.userdataGenerator(userData);
    }

}
