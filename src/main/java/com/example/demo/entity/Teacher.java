package com.example.demo.entity;

import java.util.List;

public class Teacher {
    private String name;
    private int age;
    private List<Student> students;
    private Course course;

    public Teacher(String name, int age, Course course, List<Student> students) {
        this.name = name;
        this.age = age;
        this.students = students;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
