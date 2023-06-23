package com.baonguyen.qualifierAnnotation;

import org.springframework.stereotype.Component;

/**
 * @author BAO 6/23/2023
 */

public class Student {
    private Integer age;
    private String name;

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}