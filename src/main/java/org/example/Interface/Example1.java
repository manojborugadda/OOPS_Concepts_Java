package org.example.Interface;

// Define the interface with default, static, and private methods
interface MyInterface {
    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
        privateMethod(); // Calling private method from default method
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
        privateStaticMethod(); // Calling private static method from static method
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Private static method
    private static void privateStaticMethod() {
        System.out.println("This is a private static method.");
    }
}

// Implementing the interface in a class
class MyClass implements MyInterface {
    // The class can use the default method as it is
    public void useDefaultMethod() {
        defaultMethod();
    }
}

public class Example1 {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myClass = new MyClass();

        // Call the default method via the instance
        myClass.useDefaultMethod();

        // Call the static method directly from the interface
        MyInterface.staticMethod();
    }
}

