package oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Барсик");
        System.out.println(cat.getName());
        cat.setName("Рыжик");
        System.out.println(cat.getName());
    }
}
