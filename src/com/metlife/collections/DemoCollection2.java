package com.metlife.collections;

import java.util.HashMap;
import java.util.Map;

public class DemoCollection2
{
    public static void main(String[] args)
    {
        //HashMap<Integer,String> hash=new HashMap<Integer,String>();
        Map<Integer,String> hash=new HashMap<Integer,String>();

        hash.put(101,"Demo1");
        hash.put(102,"Demo2");
        hash.put(103,"Demo3");
        hash.put(104,"Demo4");
        hash.put(103,"Replaced Value");
        System.out.println(hash.get(103));
        System.out.println(hash.remove(101));
        System.out.println(hash.size());
    }
}
