package edu.northeastern.qizeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int year = 2022;
        System.out.println(isLeapYear(year));
    }

    private static Boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 4 == 0) && (year % 400 == 0))){
            System.out.println("It's a leap year");
            return true;
        }
        else {
            System.out.println("It's not a leap year");
            return false;
        }
    }
}
