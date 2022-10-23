package oop.inheritance.polymorfizm;

public class Main {
    public static void main(String[] args){
        DB mySQL = new MySQL();
        MySQL mySQL2 = new MySQL();

        DataBase.getInfoFromDB(mySQL);

    }

    public static void test(Animal animal){
        animal.sound();
    }
}
