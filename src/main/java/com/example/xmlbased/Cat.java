package com.example.xmlbased;

public class Cat implements Animal {
    private Food food;

    public Cat(Food food) {
        this.food = food;
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking...");
    }

    public Food getFood() {
        System.out.println("Cat is eating food...");
        return food;
    }
}
