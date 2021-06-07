package com.company;

public class Warrior extends Character{

    public int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower);
        this.shieldStrength = shieldStrength;
        this.setShieldStrength(100);
        this.setAttackPower(10);
        this.setHealth(100);
        this.setSpeed(50);
        this.setStamina(100);
        this.setStrength(75);

    }

   public void decreaseShieldStrength() {
        System.out.println("Warrior "+ name + " shield strength is decreasing");

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

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}
