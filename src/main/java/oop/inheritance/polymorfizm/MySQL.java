package oop.inheritance.polymorfizm;

public class MySQL implements DB {

    @Override
    public void getInfoFromDB() {
        System.out.println("Беру данные из БД MySQL");
    }
}

