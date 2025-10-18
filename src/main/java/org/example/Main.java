package org.example;

import org.example.Polymorphism.Animal;
import org.example.Polymorphism.AnimalTrainer;
import org.example.Polymorphism.Cat;
import org.example.Polymorphism.Dog;
import org.example.Polymorphism.compileTime;
public class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        // Runtime polymorphism example
        myCat.sound();
        myDog.sound();


        /*
        Polymorphism lets methods operate on "superclass" types so they can work with any "subclass", 
        without knowing the specific subclass at compile time.
        */
        AnimalTrainer trainer = new AnimalTrainer();
        trainer.trainAnimal(new Cat());
        trainer.trainAnimal(new Dog());


        // compile-time polymorphism example
        compileTime addfunc = new compileTime();
        System.out.println("Sum of 2 numbers: " + addfunc.add(5, 10)); // Calls add(int, int)
        System.out.println("Sum of 3 numbers: " + addfunc.add(5, 10, 15)); // Calls add(int, int, int)

    }
}