package com.metlife.collections;

import java.util.HashMap;
import java.util.Map;

public class DemoCollection2
{
    public static void main(String[] args)
    {

        //HashMap<Integer,String> hash=new HashMap<Integer,String>();
        Map<Integer,String> hash=new HashMap<Integer,String>();
        //Adding key values in HashMap collection:
        hash.put(101,"Demo1");
        hash.put(102,"Demo2");
        hash.put(103,"Demo3");
        hash.put(104,"Demo4");
        //Replacing value of key 103 to new value:
        hash.put(103,"Replaced Value");
        //Print new replaced value of key 103:
        System.out.println(hash.get(103));
        //Removing key 101 from collection:
        hash.remove(101);
        //Printing remaining key values of collection after removing key 101:
        System.out.println(hash);
        //Print size of collection:
        System.out.println(hash.size());
    }
}
