package com.example;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

@ManagedBean(name = "profileBean")
@RequestScoped
public class ProfileBean implements Serializable {
    private LocalDate birthDate;
    private Integer age;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String calculateAge() {
        if (birthDate != null) {
            LocalDate today = LocalDate.now();
            age = Period.between(birthDate, today).getYears();
        }
        return null;
    }
} 