package poo.interfaces;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Au");
    }

    @Override
    public void move() {
        System.out.println("Attack");

    }

    @Override
    public void eat() {
        System.out.println("Meat");

    }
}
