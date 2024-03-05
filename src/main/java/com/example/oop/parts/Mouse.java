package com.example.oop.parts;

public class Mouse {
    String name;
    public Mouse(String name){
        this.name = name;
    }
    public void cry(){
        System.out.printf("%s가 우는 중\n",name);
    }

    public void say(){
        System.out.printf("%s가 말하는 중\n",name);
    }
}
