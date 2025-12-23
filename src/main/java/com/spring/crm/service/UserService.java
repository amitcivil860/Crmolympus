package com.spring.crm.service;

import com.spring.crm.model.User;
import com.spring.crm.repo.RestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    RestRepo restRepo;


    public void printUser() {
        List<User> result = restRepo.findAll();
        result.forEach(System.out::println);
    }
}
