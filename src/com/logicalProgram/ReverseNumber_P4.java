package com.logicalProgram;

import java.util.Scanner;

public class ReverseNumber_P4
{
    public static void main(String[] args)
    {
        int reverse = 0;
        System.out.println("Enter Any Number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}