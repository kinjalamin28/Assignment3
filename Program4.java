package com.Task3;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int sum =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = input.nextInt();

        for(int i =1; i<=n;i++)
        {
            System.out.println(i);
            sum = sum + i;
        }

        System.out.println("Sum of "+n+" number is "+sum);

    }
}

