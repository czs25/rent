package com.ext;

public class Teacher extends Person {
    public Teacher show(){
        System.out.println("teacher show");
        return new Teacher();
    }

    public Teacher show (String name) {
        System.out.println("teacher show");
        return new Teacher();
    }
}
