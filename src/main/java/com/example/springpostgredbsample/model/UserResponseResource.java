package com.example.springpostgredbsample.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoRepositoryBean
public class UserResponseResource implements Serializable {

    private int userid;

    private String name;

    private int score;
}
