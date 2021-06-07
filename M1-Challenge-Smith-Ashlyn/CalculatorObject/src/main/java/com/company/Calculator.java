package com.company;

public class Calculator {

    public static int addInts(int a, int b){
        return a + b;
    };
    public static int subtractInts(int a, int b){
        return a - b;
    };
    public static int divideInts(int a, int b){
        if (b == 0){
            return 0;
        }
        return a / b;
    };
    public static int multiplyInts(int a, int b){
        return a * b;
    };


    public static double addDoubles(double a, double b){
        return a + b;
    };
    public static double subtractDoubles(double a, double b){
        return a - b;
    };
    public static double divideDoubles(double a, double b){
        if (b == 0){
            return 0;
        }
        return a / b;
    };
    public static double multiplyDoubles(double a, double b){
        return a * b;
    };
}
