package com.sunbeaminfo.app6;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String mobile;
    private String course;
    private String subCourse;

    public Student() {
    }

    public Student(String name, String mobile, String course, String subCourse) {
        this.name = name;
        this.mobile = mobile;
        this.course = course;
        this.subCourse = subCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
        return name +"\n"+ mobile;
    }
}
