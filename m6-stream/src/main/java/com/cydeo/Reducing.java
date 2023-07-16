package com.cydeo.employee;

import com.cydeo.dish.Dish;
import com.cydeo.dish.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int result = numbers.stream().reduce(0,(a, b) ->a+b);
        Optional<Integer> result2 = numbers.stream().reduce((a,b) -> a+b);
        System.out.println(result2.get());

        System.out.println("Dish calories total");

        Optional<Integer> getTotal=DishData.getAll().stream()
                .map(Dish::getCalorie)
                .reduce(Integer::sum);
        System.out.println(getTotal.get());

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);

        System.out.println("Count");
        Long count = DishData.getAll().stream().count();
        System.out.println(count);





    }
}
