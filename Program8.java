package com.Task3;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = input.nextInt();
        if(year%4 == 0)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
