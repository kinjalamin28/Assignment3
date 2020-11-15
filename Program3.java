package com.Task3;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month :");
        int month = input.nextInt();
        if(month ==1 || month ==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("31 days are in this month");
        else if(month==4 || month==6 || month==9 || month==11)
            System.out.println("30 days are in this month");
        else if(month==2)
            System.out.println("Either 28 or 29 days are in this month");
        else
            System.out.println("Invalid Details");
    }
}
