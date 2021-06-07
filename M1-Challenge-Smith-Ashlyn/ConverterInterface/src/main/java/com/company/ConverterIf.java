package com.company;

import com.company.interfaces.Converter;

public class ConverterIf implements Converter {

    public String convertMonth(int userMonthNum){
        if(userMonthNum == 1) {
            return "January";
        }else if (userMonthNum == 2){
            return "February";
        }else if (userMonthNum == 3){
            return "March";
        }else if (userMonthNum == 4){
            return "April";
        }else if (userMonthNum == 5){
            return "May";
        }else if (userMonthNum == 6){
            return "June";
        }else if (userMonthNum == 7){
            return "July";
        }else if (userMonthNum == 8){
            return "August";
        }else if (userMonthNum == 9){
            return "September";
        }else if (userMonthNum == 10){
            return "October";
        }else if (userMonthNum == 11){
            return "November";
        }else {
            return "December";
        }
    }

    public String convertDay(int userDayNum) {
        if(userDayNum == 1){
            return "Monday";
        }else if (userDayNum == 2){
            return "Tuesday";
        }else if (userDayNum == 3){
            return "Wednesday";
        }else if (userDayNum == 4){
            return "Thursday";
        }else if (userDayNum == 5){
            return "Friday";
        }else if (userDayNum == 6){
            return "Saturday";
        }else{
            return "Sunday";
        }
    }
}
