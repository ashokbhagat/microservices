package com.ashok.practice.department.controller;

import com.ashok.practice.department.entity.Department;
import com.ashok.practice.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department save(@RequestBody Department department) {
        log.info("Inside com.ashok.practice.department.controller.DepartmentController.save");
        return departmentService.save(department);
    }

    @GetMapping("/departments/{id}")
    public Department findById(@PathVariable long id) {
        log.info("Inside com.ashok.practice.department.controller.DepartmentController.findById");
        return departmentService.findById(id);
    }

}
