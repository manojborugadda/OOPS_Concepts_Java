package org.example.Interface;

public interface Laptop {
    void cut();
    void copy();
    void paste();
    void keyboard();

    default void security() {
        commonCode();
        System.out.println("laptop security");
    }

     static void audio() { //we cannot call un-static methods in static methods
        commonCode();
        System.out.println("write audio code");
    }


    /*
    *in Java 9 this using of private methods is introduced
    *
    * for Introducing Code re-usability inside the INTERFACE we use private methods
    * ------- we can have both static method and default method having the same code
    * we can refactor this duplicate code by implementing in PRIVATE method
    * and calling this in STATIC and DEFAULT methods
    * */
    private static void commonCode() {//we can use private static method in the interfaces
        System.out.println("common code");
    }
}
