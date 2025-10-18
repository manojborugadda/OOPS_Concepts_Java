1. Polymorphism enables objects to be treated as instances of their superclass, allowing them to take on multiple forms.

“Poly” = many, “morphism” = forms → same object reference can take many forms.

**we can store an object of a "subclass" in a "superclass" reference variable.**

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

2. # concept of *runtime polymorphism*: 
This is achieved through *method overriding*, where a subclass provides a specific implementation of a method that is already defined in its superclass.

You can call the same method name on different objects, but each object can respond differently depending on its class.

```
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        //Here, the method call draw() is resolved at runtime, depending on the actual object (Circle or Square), not the reference type (Shape).
        s1.draw(); // Output: Drawing a circle
        s2.draw(); // Output: Drawing a square
    }
}
```
3. Benefits of Polymorphism:
- **Flexibility and Maintainability**: Code can be more easily extended and maintained since new subclasses can be added without changing existing code.
- **Code Reusability**: Common interfaces can be defined, allowing different classes to implement them in their own way.
- **Dynamic Method Resolution**: The method that gets executed is determined at runtime based on the actual object type, allowing for more dynamic behavior.
4. Polymorphism can also be achieved through interfaces, where different classes implement the same interface and provide their own implementations for the methods defined in the interface.

```
| Type                          | When it Happens | How it Works       | Keyword / Concept                      |
| ----------------------------- | --------------- | ------------------ | -------------------------------------- |
| **Compile-time polymorphism** | At compile time | Method Overloading | same method name, different parameters |
| **Runtime polymorphism**      | At runtime      | Method Overriding  | subclass redefines a superclass method |

```