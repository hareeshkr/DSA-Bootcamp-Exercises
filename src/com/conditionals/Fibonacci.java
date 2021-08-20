package com.conditionals;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0, n2=1, n3;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int count = in.nextInt();
        System.out.print(n1+ " " + n2);
        for (int i=0; i<count-2; i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }
}
