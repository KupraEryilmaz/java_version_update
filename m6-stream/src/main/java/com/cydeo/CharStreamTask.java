package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        list.stream()
                .map(s->s.length())
                .forEach(System.out::println);

    }
}
