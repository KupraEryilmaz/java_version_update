package com.cydeo.user;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Mike","Smith",35));
        users.add(new User("Tom","Evan",25));
        users.add(new User("Emma","Pollard",55));

        //Print all user
        printName(users, user -> true);

        //Print all people that last name starts with E
        printName(users, user -> user.getLastName().startsWith("E"));


    }

    private static void printName(List<User> list, Predicate<User> predicate){
        for(User user : list){
            if(predicate.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
