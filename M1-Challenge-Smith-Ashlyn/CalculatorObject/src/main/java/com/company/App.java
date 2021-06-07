package com.company;

public class App {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println("1 + 1 = " + calculator.addInts(1, 1));
        System.out.println("23 - 52 = " + calculator.subtractInts(23, 52));
        System.out.println("34 * 2 = " + calculator.multiplyInts(34, 2));
        System.out.println("12 / 3 = " + calculator.divideInts(12, 3));
        System.out.println("12 / 7 = " + calculator.divideDoubles(12, 7));
        System.out.println("3.4 + 2.3 = " + calculator.addDoubles(3.4, 2.3));
        System.out.println("6.7 * 4.4 = " + calculator.multiplyDoubles(6.7, 4.4));
        System.out.println("5.5 - 0.5 = " + calculator.subtractDoubles(5.5, 0.5));
        System.out.println("10.8 / 2.2 = " + calculator.divideDoubles(18.8, 2.2));
    }
}
