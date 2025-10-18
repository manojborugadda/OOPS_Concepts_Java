package org.example.Polymorphism;

public class compileTime {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) { //same name with different parameters
        return a + b + c;
    }


}
