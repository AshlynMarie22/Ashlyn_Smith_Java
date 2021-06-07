package com.company;

public class Constable extends Character{
    public String jurisdiction;

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, String jursidiction) {
        super(name, strength, health, stamina, speed, attackPower);
        this.jurisdiction = jurisdiction;
        this.setAttackPower(5);
        this.setHealth(100);
        this.setSpeed(20);
        this.setStamina(60);
        this.setStrength(60);
    }


    public void run(){

    };

    public void attack(){

    };

    public void heal(){

    };

    public void decreaseHealth(){

    };

    public void increaseStamina(){

    };
}
