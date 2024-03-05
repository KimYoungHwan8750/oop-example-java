package com.example.oop.animal;

import com.example.oop.parts.Eye;
import com.example.oop.parts.Hand;
import com.example.oop.parts.Leg;
import com.example.oop.parts.Mouse;

public class Starfish extends Animal{
    String name = "불가사리";
    Mouse mouse = new Mouse(name);

    public Starfish(int height, int weight){
        super(height,weight);
    }
}
