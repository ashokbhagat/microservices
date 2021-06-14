package com.ashok.practice.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FallBackMethodController {


    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        log.info("Inside com.ashok.practice.gateway.FallBackMethodController.userServiceFallBackMethod");
        return "User service taking longer than expected..Seems to be down";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){
        log.info("Inside com.ashok.practice.gateway.FallBackMethodController.departmentServiceFallBackMethod");
        return "Department service taking longer than expected..Seems to be down";
    }
}
