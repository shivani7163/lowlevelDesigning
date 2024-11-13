package org.example.oops1;

public class Student {

    //attributes
    int age;
    float psp;
    String name;

//    methods
    void changeBatch(){
        System.out.println("Change batch");
    }

    void joinClass(){
        System.out.println(name+" is joining class");
    }

    void printDetails(){
        System.out.println(name+" is "+age+" years old and has psp "+psp);
    }

}
