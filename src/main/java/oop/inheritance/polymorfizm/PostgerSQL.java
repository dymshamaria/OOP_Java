package oop.inheritance.polymorfizm;

public class PostgerSQL implements  DB{

    @Override
    public void getInfoFromDB(){
        System.out.println("Беру данные из БД PostgerSQL");
    }
}
