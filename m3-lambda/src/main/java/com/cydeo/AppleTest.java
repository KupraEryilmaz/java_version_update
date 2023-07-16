package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        List<Apple> greenApple = filterApple(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);

        List<Apple> heavyApple = filterApple(inventory, new AppleHeavyPredicate());
        System.out.println(heavyApple);

        List<Apple> lightApple = filterApple(inventory, apple -> apple.getWeight()<=200);
        System.out.println(lightApple);



    }

    public static List<Apple> filterApple(List<Apple> list, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : list){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
