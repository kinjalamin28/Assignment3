package com.Task3;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        float num1 = input.nextFloat();
        System.out.print("Enter Number2: ");
        float num2 = input.nextFloat();

        if(Math.abs(num1-num2)<0.01)
        {
            System.out.println("Number are same upto to decimal points");
        }
        else
            System.out.println("Number are different");


    }
}
