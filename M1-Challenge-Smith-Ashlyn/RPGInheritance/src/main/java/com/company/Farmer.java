package com.company;

public class Farmer extends Character{

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, String role) {
        super(name, strength, health, stamina, speed, attackPower);
        this.setAttackPower(1);
        this.setHealth(100);
        this.setSpeed(10);
        this.setStamina(75);
        this.setStrength(75);
    }

    public void plow() {
        System.out.println("Farmer " + name + " is plowing");
    }
    public void harvest() {
        System.out.println("Farmer "+ name + " is harvesting");

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

    public void decreaseStamina(){

    };
}
