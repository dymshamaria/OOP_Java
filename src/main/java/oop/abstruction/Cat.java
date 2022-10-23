package oop.abstruction;

public class Cat extends Animal implements Sound {

    @Override
    public void sound() {
        System.out.println("Мяу");
    }


}
