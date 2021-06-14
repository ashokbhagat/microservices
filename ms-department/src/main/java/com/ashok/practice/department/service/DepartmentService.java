package com.ashok.practice.department.service;

import com.ashok.practice.department.entity.Department;
import com.ashok.practice.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department department) {
        log.info("Inside com.ashok.practice.department.service.DepartmentService.save");
        return departmentRepository.save(department);
    }

    public Department findById(long id) {
        return departmentRepository.findById(id).orElse(null);
    }
}
