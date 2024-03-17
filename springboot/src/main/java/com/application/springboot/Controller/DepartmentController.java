package com.application.springboot.Controller;

import com.application.springboot.Model.Department;
import com.application.springboot.Model.User;
import com.application.springboot.Repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<User> getAllDepartment(){
        return departmentRepository.findAll();

    }
    @PostMapping
    public User createDepartment(Department department){
        return departmentRepository.save(department);

    }
}
