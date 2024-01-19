package com.metlife.assessment;

import java.util.Scanner;

    public class persistenceJava
    {
        public static int multiplyDigits(int a)
        {
            int output = 1;
            while (a != 0) {
                output *= a % 10;
                a /= 10;
            }
            return output;
        }

        public static int multiplicativePersistence(int b)
        {
            int persist1 = 0;
            while (b >= 10) {
                b = multiplyDigits(b);
                persist1++;
            }
            return persist1;
        }

        public static int sumDigits(int c)
        {
            int total = 0;
            while (c != 0) {
                total += c % 10;
                c /= 10;
            }
            return total;
        }

        public static int additivePersistence(int d)
        {
            int persist2 = 0;
            while (d >= 10) {
                d = sumDigits(d);
                persist2++;
            }
            return persist2;
        }

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter any number: ");
            int k = scanner.nextInt();

            int output1 = multiplicativePersistence(k);
            int output2 = additivePersistence(k);
            System.out.println("Additive persistence of " + k + " is " + output2);
            System.out.println("Multiplicative persistence of " + k + " is " + output1);
        }
    }
