package com.company;

public class IceCreamPOS extends IceCreamFactory {
    public boolean cup;
    public boolean cone;
    public int numberOfScoops;
    public double pricePerScoop;

    public IceCreamPOS(String name, String type, String baseFlavor, double wholesaleCost, boolean cup, boolean cone, int numberOfScoops, double pricePerScoop) {
        super(name, type, baseFlavor, wholesaleCost);
        this.cup = cup;
        this.cone = cone;
        this.numberOfScoops = numberOfScoops;
        this.pricePerScoop = pricePerScoop;
        this.setWholesaleCost(0.25);
    }

    public double totalProfitFromSale() { return (numberOfScoops * pricePerScoop) - wholesaleCost;}

    public void printProfit(){
        System.out.println("Profit from sale" + totalProfitFromSale());
    }

    public String hasConeOrCup;{
        if (isCone() == true){
            hasConeOrCup = "Customer wants cone";
        }else hasConeOrCup = "Customer wants cup";
    }

    public void printCustomerOrder(){
        System.out.println(hasConeOrCup + " and "+ numberOfScoops + " scoops.");
    }



    public boolean isCup() {
        return cup;
    }

    public void setCup(boolean cup) {
        this.cup = cup;
    }

    public boolean isCone() {
        return cone;
    }

    public void setCone(boolean cone) {
        this.cone = cone;
    }

    public int getNumberOfScoops() {
        return numberOfScoops;
    }

    public void setNumberOfScoops(int numberOfScoops) {
        this.numberOfScoops = numberOfScoops;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }
}
