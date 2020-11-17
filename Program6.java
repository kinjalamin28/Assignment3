package com.Task3;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>b && b>c)
            System.out.println("DECREASING");
        else if(a<b && b<c)
            System.out.println("INCREASING");
        else
            System.out.println("Neither increasing nor decreasing order");
    }
}
