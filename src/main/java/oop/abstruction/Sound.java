package oop.abstruction;

public interface Sound {

    default void soundMix(){
        System.out.println("bus bus");
    }
}
