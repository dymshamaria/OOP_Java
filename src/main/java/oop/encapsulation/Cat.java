package oop.encapsulation;

public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("Барсик")) {
            this.name = "Секретное имя";
        } else {
            this.name = name;
        }
    }
}
