package com.example.oop.animal;

import com.example.oop.parts.Eye;
import com.example.oop.parts.Hand;
import com.example.oop.parts.Leg;
import com.example.oop.parts.Mouse;
import lombok.Getter;

@Getter
public class Cat extends Animal{
    String name = "고양이";
    Eye eye = new Eye(name);
    Mouse mouse = new Mouse(name);
    Leg leg = new Leg(name);
    Hand hand = new Hand(name);

    public Cat(int height, int weight){
        super(height,weight);
    }
}
