package org.example.rpg;

public class Troll extends Monster{

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return super.bleed();
    }

    @Override
    public double poison() {
        return super.poison();
    }

    @Override
    public double attack() {
        return super.attack();
    }
}
