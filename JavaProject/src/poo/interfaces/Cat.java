package poo.interfaces;

public class Cat implements Animal{


    @Override
    public void sound() {
        System.out.println("Miau");
    }

    @Override
    public void move() {
        System.out.println("Sthealh");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }
}
