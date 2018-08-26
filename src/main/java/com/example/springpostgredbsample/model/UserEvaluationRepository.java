package com.example.springpostgredbsample.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserEvaluationRepository extends JpaRepository<Userdata,String> {

    Userdata findByUserid(int userid);

}
