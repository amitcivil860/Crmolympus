package com.spring.crm.cotroller;


import com.spring.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public void getUserData() {
        userService.printUser();
    }

    @GetMapping("/user/amit")
    public void getUserData2() {
        userService.printUser();
    }

}
