package com.example.oop.animal;

import lombok.Getter;

@Getter
public class Animal {
    float height;
    float weight;
    public Animal(){}
    public Animal(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

}
