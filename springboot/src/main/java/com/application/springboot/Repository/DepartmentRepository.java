package com.application.springboot.Repository;

import com.application.springboot.Model.Department;
import com.application.springboot.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
