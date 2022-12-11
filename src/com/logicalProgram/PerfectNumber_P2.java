package com.logicalProgram;

import java.util.Scanner;

//like 28 = 1+2+4+7+14
public class PerfectNumber_P2
{
    public static void main(String[] args)
    {
        int sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number ");
        int number=sc.nextInt();

        int i=1;
            while (i<=number/2)
            {
            if(number%i==0)
            {
                sum=sum+i;
            }
                i++;
        }
        if(sum==number)
        {
            System.out.println("Number is Perfect");
        }
        else
        {
             System.out.println("Number is Not Perfect");
        }
    }
}
