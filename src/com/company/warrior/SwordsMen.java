package com.company.warrior;

public class SwordsMen extends Warrior {

    public SwordsMen() {
    }

    public SwordsMen(String name, String type, String power, String health) {
        super(name, type, power, health);
    }

    @Override
    public void hit() {
        System.out.println("Swords Men");
    }
}
