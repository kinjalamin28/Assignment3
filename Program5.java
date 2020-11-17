package com.Task3;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        long sum =0;
        int i =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number :");
        long n = input.nextLong();
        while (n!=0)
        {
            sum = sum + n%10;
            n = n/10;
            i++;
        }
        System.out.println("Total digits are "+i);
        System.out.println("Sum of all digits are "+sum);


    }
}
