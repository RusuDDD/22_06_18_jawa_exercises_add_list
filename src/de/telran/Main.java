package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Let a list of List objects of type User{String fName, String lName, int age } be given.
//       Suppose an error occurred while reading Users from the database and all users from
//      list were swapped between fName and lName. You must write a method,
//      which will fix this situation.

        User user1 = new User("Vasya", "Vasilievici", 28);
        User user2 = new User("Grisha", "Murat", 15);
        User user3 = new User("Misha", "Kaban", 75);
        User user4 = new User("Leolea", "Rotmoi", 45);
        User user5 = new User("Kristina", "Jason", 25);
        User user6 = new User("Vanesa", "Vanmiret", 58);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        System.out.println(users);
        System.out.println(transformation(users));

    }

    public static List<User> transformation(List<User> users) {
        List<User> newUser = new ArrayList<>();
        if (users == null || users.isEmpty()) {
            return users;
        }
        for (User u : users) {
            newUser.add(new User(u.getlName(), u.getfName(), u.getAge()));
        }
        return newUser;
    }

}

