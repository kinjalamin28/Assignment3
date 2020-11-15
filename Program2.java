package com.Task3;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        int n[] = new int[10];
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 values");
        for (int i=0;i<10;i++)
        {
            n[i] = input.nextInt();
            sum = sum+n[i];
        }

        System.out.println("sum = "+sum);
        System.out.println("Average = "+(sum/10));

    }
}
