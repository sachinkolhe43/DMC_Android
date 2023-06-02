package com.sunbeaminfo.app5;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String course;
    private String subCourse;

    public Student() {
    }

    public Student(String name, String course, String subCourse) {
        this.name = name;
        this.course = course;
        this.subCourse = subCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSubCourse() {
        return subCourse;
    }

    public void setSubCourse(String subCourse) {
        this.subCourse = subCourse;
    }

    @Override
    public String toString() {
        return name + "\n" + course;
    }
}
