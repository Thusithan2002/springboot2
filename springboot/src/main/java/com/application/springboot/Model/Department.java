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
@Table(name="Department")
public class Department {

    @Id
    private long DepId;
    @Column(name="DepName")
    private String DepName;

    public Department(long depId, String depName) {
        DepId = depId;
        DepName = depName;
    }

    public Department() {

    }


    public long getDepId() {
        return DepId;
    }

    public void setDepId(long depId) {
        DepId = depId;
    }

    public String getDepName() {
        return DepName;
    }

    public void setDepName(String depName) {
        DepName = depName;
    }






}


