package com.company.warrior;

public class Shooter extends Warrior {

    public Shooter() {
    }

    public Shooter(String name, String type, String power, String health) {
        super(name, type, power, health);
    }


    @Override
    public void hit() {
        System.out.println("Shooter");

    }
}
