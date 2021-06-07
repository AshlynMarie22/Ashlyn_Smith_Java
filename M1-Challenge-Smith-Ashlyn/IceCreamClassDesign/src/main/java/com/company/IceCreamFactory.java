package com.company;

public class IceCreamFactory {
    public String name;
    public String type;
    public String baseFlavor;
    public double wholesaleCost;

    public IceCreamFactory(String name, String type, String baseFlavor, double wholesaleCost) {
        this.name = name;
        this.type = type;
        this.baseFlavor = baseFlavor;
        this.wholesaleCost = wholesaleCost;
    }

    public void icecreamName(){
        System.out.println("This is an icecream that is available to be purchased: " + name);
    }
    public void icecreamDetails(){
        System.out.println(name + "has a base flavor of "+ baseFlavor + "and it is a "+ type);
    }

    public void icecreamCost(){
        System.out.println(name + "costs per scoop" + wholesaleCost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBaseFlavor() {
        return baseFlavor;
    }

    public void setBaseFlavor(String baseFlavor) {
        this.baseFlavor = baseFlavor;
    }

    public double getWholesaleCost() {
        return wholesaleCost;
    }

    public void setWholesaleCost(double wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
    }
}
