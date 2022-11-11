package com.example.entity;

public class Dog implements Animal {
    private String name;
    private Food food;

    public Dog() {

    }
    public Dog(Food food) {
        food = this.food;
    }
    @Override
    public void walk() {
        System.out.println("Dog is walking...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Calling setter :: setName");
        this.name = name;
    }

    public Food getFood() {
        System.out.println("Dog is eating food...");
        return food;
    }

    public void setFood(Food food) {
        System.out.println("Calling setter :: setFood");
        this.food = food;
    }
}
