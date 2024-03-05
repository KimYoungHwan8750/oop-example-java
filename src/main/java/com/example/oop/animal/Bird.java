package com.example.oop.animal;

import com.example.oop.parts.Eye;
import com.example.oop.parts.Leg;
import com.example.oop.parts.Mouse;
import com.example.oop.parts.Wing;
import lombok.Getter;

@Getter
public class Bird extends Animal{
    String name = "새";
    Eye eye = new Eye(name);
    Mouse mouse = new Mouse(name);
    Leg leg = new Leg(name);
    Wing wing = new Wing(name);

    public Bird(int height, int weight){
        super(height,weight);
    }
}
