1. Polymorphism enables objects to be treated as instances of their superclass, allowing them to take on multiple forms.

“Poly” = many, “morphism” = forms → same object reference can take many forms.

we can store an object of a "subclass" in a "superclass" reference variable.

```
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // Dog object, treated as Animal
        Animal a2 = new Cat(); // Cat object, treated as Animal

        a1.makeSound(); // Output: Woof!
        a2.makeSound(); // Output: Meow!
    }
}

```

Here, a1 and a2 are both Animal references, but they behave differently depending on the actual object type (Dog or Cat).