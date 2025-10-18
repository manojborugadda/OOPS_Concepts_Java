package org.example;

import org.example.Polymorphism.Animal;
import org.example.Polymorphism.Cat;
import org.example.Polymorphism.Dog;
public class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myCat.sound();
        myDog.sound();
    }
}