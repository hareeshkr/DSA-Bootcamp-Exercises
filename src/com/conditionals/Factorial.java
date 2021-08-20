package com.conditionals;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fact=1;
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        if(num == 0 || num == 1){
            System.out.println(1);
        }
        else{
            while(num>=1){
                fact = fact * num;
                num--;
            }
            System.out.println(fact);
        }
    }
}
