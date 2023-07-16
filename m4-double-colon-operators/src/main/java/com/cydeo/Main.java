package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Calculate sum = (x,y) -> System.out.println(x+y);
        sum.calculate(1,2);

        Calculate s1 = (x,y) -> Calculator.findSum(x,y);
        s1.calculate(1,2);

        //Reference to a static method
        Calculate s2 = Calculator::findSum;
        s2.calculate(1,2);

        System.out.println("******************************************");

        Calculate s3 = (x,y) -> System.out.println(x*y);
        s3.calculate(2,3);

        Calculate s4 = (x,y) -> new Calculator().findMultiply(x,y);
        s4.calculate(2,3);

        //Reference to instant method
        Calculate s5 = new Calculator()::findMultiply;
        s5.calculate(2,3);

        System.out.println("**********************************************");
        BiFunction<String,Integer,String> b1 = (str,i) -> str.substring(i);
        String result = b1.apply("Java",1);
        System.out.println(result);

        BiFunction<String,Integer,String > b2 = String::substring;
        String str= b2.apply("Python",2);
        System.out.println(str);

        System.out.println("**********************************************");
        Function<Integer,Double> func = new MyClass()::method;
        Double d= func.apply(3);
        System.out.println(d);

        BiFunction<MyClass,Integer,Double> biFun = MyClass::method;
        Double d1 = biFun.apply(new MyClass(),4);
        System.out.println(d1);

        System.out.println("**********************************************");
        Consumer<Integer> c = i -> System.out.println(i);
        Consumer<Integer> c1 = System.out::println;



    }
}
