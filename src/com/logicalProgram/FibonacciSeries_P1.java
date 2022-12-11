package com.logicalProgram;
//0 1 1 2 3 5 8 13
public class FibonacciSeries_P1
{
    public static void main(String[] args)
    {
        System.out.println("Fibonacci Series is :- ");
        int n1=0, n2=1, n3 ;
        System.out.print(n1+" "+n2);
        for(int i=2; i<10; i++)
        {
            n3=n1+n2;
            System.out.print(" " +n3);
            n1=n2;
            n2=n3;
        }
    }
}
