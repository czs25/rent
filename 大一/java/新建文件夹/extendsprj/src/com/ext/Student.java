package com.ext;

public class Student extends Person {
    public Student show(){
        System.out.println("student show");
        return new Student();
    }
}
