package com.example.springpostgredbsample.Factory;

import com.example.springpostgredbsample.model.UserResponseResource;
import com.example.springpostgredbsample.model.Userdata;

public class UserDataFactory {

    public static UserResponseResource userdataGenerator(Userdata userdata){
        return new UserResponseResource(
                userdata.getUserid(),
                userdata.getName(),
                userdata.getScore()
        );
    }
}
