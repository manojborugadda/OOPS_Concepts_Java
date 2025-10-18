package org.example.Interface;

public class Lenovo implements Laptop{

    @Override
    public void cut() {
        System.out.println("lenovo cut code");
    }

    @Override
    public void copy() {
        System.out.println("lenovo copy code");
    }

    @Override
    public void paste() {
        System.out.println("lenovo paste code");
    }

    @Override
    public void keyboard() {
        System.out.println("lenovo keyboard code");
    }

    public void capture() {//this method is not implemented method of Laptop Interface
        //we can define our own methods in this implemented class other than methods defined in interface
        System.out.println("lenovo capture code");
    }

    @Override
    public void security() {
        //Laptop.super.security();
        System.out.println("it is lenovo's security");
    }
}
