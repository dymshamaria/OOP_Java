package oop.inheritance;

public class Cat extends Animal {

    @Override
    public void someSound() {
        super.someSound();
        System.out.println("Кот мяукает");
    }
}
