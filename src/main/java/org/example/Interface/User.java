package org.example.Interface;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.copy();
        lenovo.cut();
        lenovo.keyboard();
        lenovo.paste();
        lenovo.capture();
        Laptop.audio();
        lenovo.security();
        System.out.println("------------------------");
        Dell dell = new Dell();
        dell.security();
        dell.paste();
    }
}
