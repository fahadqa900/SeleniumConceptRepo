package com.metlife;

import java.util.Scanner;

public class Abundant
{
    public static void main(String[] args)
    {

        int n, i, j, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();

        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i/2; j++)
            {
                if (i % j == 0)
                {
                    sum = sum + j;
                }
            }
            if (sum > i)
                System.out.print( i+" ");
            sum = 0;
        }
    }

    }