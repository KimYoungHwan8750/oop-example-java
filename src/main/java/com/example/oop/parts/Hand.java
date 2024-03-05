package com.example.oop.parts;

public class Hand {
    String name;
    public Hand(String name){
        this.name = name;
    }
    public void throwing(String something){
        System.out.printf("%s가 %s을(를) 던졌다.\n",name,something);
    }

    public void handClap(){
        System.out.printf("%s가 박수를 친다.\n",name);
    }
}
