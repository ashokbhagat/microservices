package com.ashok.practice.user.controller;

import com.ashok.practice.user.entity.User;
import com.ashok.practice.user.service.UserService;
import com.ashok.practice.user.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User save(@RequestBody User User) {
        log.info("Inside com.ashok.practice.User.controller.UserController.save");
        return userService.save(User);
    }

    @GetMapping("/users/{id}")
    public ResponseTemplateVO findById(@PathVariable("id") long id) {
        log.info("Inside com.ashok.practice.user.controller.UserController.findById");
        return userService.findById(id);
    }

}
