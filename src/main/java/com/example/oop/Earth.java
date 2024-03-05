package com.example.oop;

import com.example.oop.animal.Animal;
import com.example.oop.animal.Bird;
import com.example.oop.animal.Cat;

public class Earth {
    public static void main(String[] args) {
        Bird bird = new Bird(15,300);
        Cat cat = new Cat(40,4500);
        cat.getEye().see("사람");
        bird.getEye().see("비트코인 차트");
        bird.getMouse().cry();
    }
}
