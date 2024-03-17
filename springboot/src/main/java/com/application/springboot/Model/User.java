package com.application.springboot.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Users")
public class User {

    @Id
    private long UserId;
    @Column(name="UserName")
    private String UserName;
    @Column(name="Age")
    private long Age;

    public User(long userId, String userName, long age) {
        UserId = userId;
        UserName = userName;
        Age = age;
    }

    public User() {

    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public long getAge() {
        return Age;
    }

    public void setAge(long age) {
        Age = age;
    }




}
