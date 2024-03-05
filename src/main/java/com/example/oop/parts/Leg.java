package com.example.oop.parts;

public class Leg {
    String name;
    public Leg(String name){
        this.name = name;
    }
    public void run(){
        System.out.printf("%s가 뛰는 중\n",name);
    }
}
