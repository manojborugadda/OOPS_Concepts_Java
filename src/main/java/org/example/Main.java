package org.example;

import org.example.Polymorphism.Animal;
import org.example.Polymorphism.AnimalTrainer;
import org.example.Polymorphism.Cat;
import org.example.Polymorphism.Dog;
public class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myCat.sound();
        myDog.sound();


/*
Polymorphism lets methods operate on "superclass" types so they can work with any "subclass", 
without knowing the specific subclass at compile time.
*/
        AnimalTrainer trainer = new AnimalTrainer();
        trainer.trainAnimal(new Cat());
        trainer.trainAnimal(new Dog());
    }
}