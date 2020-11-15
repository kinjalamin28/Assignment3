package com.Task3;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        int rows, val = 1, blank, i, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        System.out.println("Pascal's triangle");
        for(i = 0; i<rows; i++) {
            for(j = 0; j <= i; j++) {
                if (j == 0||i == 0)
                    val = 1;
                else
                    val = val*(i-j+1)/j;
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


}
