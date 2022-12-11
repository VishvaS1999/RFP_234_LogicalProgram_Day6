package com.logicalProgram;
//prime number is divided by 1 and itself like 2,3,5,7,11...

import java.util.Scanner;

public class PrimeNumber_P3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int number=sc.nextInt();

        boolean prim = false;
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                prim =true;
            }
        }
        if (!prim)
        {
            System.out.println("its prime number");
        }
        else
        {
            System.out.println("it not prime");
        }
    }

}
