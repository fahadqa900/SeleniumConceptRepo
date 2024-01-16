package com.metlife.java_assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assignment
{
    public static void main(String[] args) throws Exception
    {
        //Print binary triangle:
        int a;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer value");
        a=Integer.parseInt(in.readLine());
       for(int i=1;i<=a;i++)
       {
       for(int j=1;j<=i;j++)
       {
        System.out.print(j);
       }
        }
        }
    }
