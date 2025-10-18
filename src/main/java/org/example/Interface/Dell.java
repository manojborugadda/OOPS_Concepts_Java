package org.example.Interface;

public class Dell implements Laptop{
    @Override
    public void cut() {
        System.out.println("dell cut code");
    }

    @Override
    public void copy() {
        System.out.println("dell copy code");
    }

    @Override
    public void paste() {
        System.out.println("dell paste");
    }

    @Override
    public void keyboard() {
        System.out.println("dell's keyboard");
    }

    @Override
    public void security() {
        Laptop.super.security();
    }
}
