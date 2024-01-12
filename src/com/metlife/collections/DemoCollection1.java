package com.metlife.collections;

import java.util.ArrayList;
import java.util.List;

public class DemoCollection1
{
    public static void main(String[] args)
    {
        List<Integer> lst=new ArrayList<Integer>();
        lst.add(50);
        lst.add(60);
        lst.add(44);
        lst.add(889);
        lst.add(43);
        lst.add(23);
        lst.add(190);
        //Print all store values of ArrayList:
        System.out.println(lst);
        //Remove 60 from ArrayList:
        lst.remove(lst.get(1));
        //Print values of ArrayList after removing 40 from collection:
        System.out.println(lst);
        //Print values greater than or equal to 50:
        int i=0;
        while (i<189)
        {
            if (i>=50)
            {
                break;
            }
            else
            {
             for(int i=0;i<189;i++)
             {
                 System.out.println(lst.get(i));
             }
            }
        }

    }
}
