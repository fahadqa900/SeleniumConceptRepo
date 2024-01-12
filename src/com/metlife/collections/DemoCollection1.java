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
        //Print size of ArrayList:
        System.out.println(lst.size());
        //Remove 60 from ArrayList:
        //By taking index through get method:
        //lst.remove(lst.get(1));
        //By taking index:
        //lst.remove(1);
        //By taking Object:
        lst.remove((Object)60);
        //Print values of ArrayList after removing 60 from collection:
        System.out.println(lst);
        //Print values greater than or equal to 50:
        for(int val:lst)
        {
            if (val>=50) {
                System.out.println(val);
            }
        }

    }
}
