package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("I'm a Dog. My name is " + name + ". Gav");
    }
}
