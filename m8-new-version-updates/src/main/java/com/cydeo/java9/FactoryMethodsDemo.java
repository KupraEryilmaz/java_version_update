package com.cydeo;

import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {

        //Creating unmodifiable List before Java9
        List<String> course = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));
       // course.add("PS");
        System.out.println(course);

        //Creating unmodifiable List after Java9
        List<String> myCourse = List.of("Java","Spring","Agile");
        //myCourse.add("PS");
        System.out.println(myCourse);

        //Creating unmodifiable Set after Java9
        Set<String> myProducts = Set.of("Butter","Bread","Milk");
        //myProducts.add("Egg");
        System.out.println(myProducts);

        //Creating unmodifiable Map after Java9
        Map<String,Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV",1),
                Map.entry("PSP",1),
                Map.entry("Chair",5)
        );
        System.out.println(myCart);



    }
}
