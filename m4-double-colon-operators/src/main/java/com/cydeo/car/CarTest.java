package com.cydeo.car;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //Zero argument constructor
        Supplier<Car> s1 = () -> new Car();
        System.out.println(s1.get().getModel());


        Supplier<Car> s2 = Car::new;
        System.out.println(s2.get().getModel());

        //One argument constructor
        Function<Integer,Car> s3 = model -> new Car(model);
        System.out.println(s3.apply(2015));

        Function<Integer,Car> s4 = Car::new;
        System.out.println(s4.apply(2016));

        //Two argument constructor
        BiFunction<String,Integer,Car> s5 = (make,model) -> new Car(make,model);
        System.out.println(s5.apply("Honda", 2023));

        BiFunction<String,Integer,Car> s6 = Car::new;
        System.out.println(s6.apply("Honda", 2022));

    }
}
