package com.example.springpostgredbsample.model;


import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Userdata {

    @Id
    private int userid;

    @Column(name="name")
    private String name;

    @Column(name="score")
    private int score;

}
