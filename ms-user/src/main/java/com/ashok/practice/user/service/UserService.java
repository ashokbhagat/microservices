package com.ashok.practice.user.service;

import com.ashok.practice.user.entity.User;
import com.ashok.practice.user.repository.UserRepository;
import com.ashok.practice.user.vo.Department;
import com.ashok.practice.user.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User save(User user){
      return  userRepository.save(user);
    }

    public ResponseTemplateVO findById(Long id) {
        User user =  userRepository.findById(id).orElse(null);

        Department department = restTemplate.getForObject("http://MS-DEPARTMENT/departments/"+id, Department.class);

        ResponseTemplateVO vo = new ResponseTemplateVO();

        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }


}
