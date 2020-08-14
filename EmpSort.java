package com.PraticePrograms;

import java.util.TreeMap;
import java.util.TreeSet;

public class EmpSort {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeSet = new TreeMap<Integer,String>((o1,o2) ->(o1 < o2)? 1:(o1 < o2)?0:-1);
        treeSet.put(90,"EEE");
        treeSet.put(100,"AAA");
        treeSet.put(30,"BBB");
        treeSet.put(20,"CCC");
        treeSet.put(10,"DDD");
        System.out.println(treeSet);
    }
}
