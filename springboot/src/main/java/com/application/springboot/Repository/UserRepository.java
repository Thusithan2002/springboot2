package com.application.springboot.Repository;

import com.application.springboot.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //all crud database methods

}
