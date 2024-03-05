package com.example.oop.parts;

public class Eye {
    String name;
    public Eye(String name){
        this.name = name;
    }
    public void see(String something){
        System.out.printf("%s가 %s을(를) 보는 중\n",name,something);
    }
}
