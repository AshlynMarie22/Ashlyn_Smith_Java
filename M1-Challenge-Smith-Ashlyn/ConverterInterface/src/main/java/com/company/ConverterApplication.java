package com.company;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a month number:");
        int userMonthNum = Integer.parseInt(scan.nextLine());
        if (userMonthNum >= 1 && userMonthNum <= 12) {
            System.out.println("The number you entered is: " + userMonthNum);
        } else {
            System.out.println("You have entered an invalid number, please enter a number between 1-12.");
        }
        System.out.println("Enter a day of the week number(1 being Monday and 7 being Sunday:");
        int userDayNum = Integer.parseInt(scan.nextLine());
        if (userDayNum >= 1 && userDayNum <= 7) {
            System.out.println("The number you entered is: " + userDayNum);
        } else {
            System.out.println("You have entered an invalid number, please enter a number between 1-7.");
        }

        ConverterIf ifConvert = new ConverterIf();
        System.out.println("Converting with if the month is: "+ ifConvert.convertMonth(userMonthNum));
        System.out.println("Converting with if this is the day of the week: " + ifConvert.convertDay(userDayNum));

        ConverterSwitch switchConvert = new ConverterSwitch();
        System.out.println("Converting with switch the month is: "+ switchConvert.convertMonth(userMonthNum));
        System.out.println("Converting with switch this is the day of the week: " + switchConvert.convertDay(userDayNum));

    }

}
