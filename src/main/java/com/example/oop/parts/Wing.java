package com.example.oop.parts;

public class Wing {
    String name;
    public Wing(String name){
        this.name = name;
    }
    public void fly(){
        System.out.printf("%s가 나는 중\n",name);
    }
}
