package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        System.out.println("**********************************************");

        //Ascending Order
        Collections.sort(list);
        System.out.println(list);

        System.out.println("**********************************************");

        //Descending Order
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        System.out.println("**********************************************");
        Collections.sort(list, ((o1, o2) -> (o1>o2)? -1 :(o1<o2)? 1 :0));
        System.out.println(list);

        System.out.println("**********************************************");

        //compareTo() method

        //Ascending Order
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);

        //Descending Order
        list.sort((o2,o1)-> o1.compareTo(o2));
        System.out.println(list);



    }
}
