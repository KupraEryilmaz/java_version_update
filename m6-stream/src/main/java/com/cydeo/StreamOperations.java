package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,2,4,5);

        System.out.println("Filter");
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);


        System.out.println("Distinct");
        list.stream()
                .filter(i->i%2==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Limit");
        list.stream()
                .filter(i-> i%2==0)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("Skip");
        list.stream()
                .filter(i->i%2==0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("Map");
        list.stream()
                .map(i->i*2)
                .filter(i->i%3==0)
                .forEach(System.out::println);



    }

}
