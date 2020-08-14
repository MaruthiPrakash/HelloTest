package com.PraticePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("EEE");
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        List<String> data = list.stream().filter(p -> p.contains("maruthi")).collect(Collectors.toList());

        List<String> data1 = list.stream().filter(p -> p.contains("maruthi")).map(p ->p.toUpperCase()).collect(Collectors.toList());

        list.stream().forEach(action ->{
            //System.out.println(action);
        });

       // System.out.println(list.stream().count());

        boolean isValue = list.stream().anyMatch(p -> p.equalsIgnoreCase("maruthi"));

        //System.out.println(list.stream().distinct().collect(Collectors.toList()));


        list.stream().sorted();

        //System.out.println(isValue);

        //System.out.println(list);

        Stream<String> stream = Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> s.startsWith("a"));

        stream.anyMatch(s -> true);    // ok
       // stream.noneMatch(s -> true);   // exception
    }
}
