package by.java.practice.lesson7_HashMap.repository;

import by.java.practice.lesson7_HashMap.Exceptions.UserNotFoundException;
import by.java.practice.lesson7_HashMap.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> users = new ArrayList<>();
    static {
        User user1 = new User("login","pass","name","surname");
        User user2 = new User("login1","pass1","name1","surname1");
        User user3 = new User("login2","pass2","name2","surname2");
        User user4 = new User("login3","pass3","name3","surname3");
        User user5 = new User("login4","pass4","name4","surname4");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    public User searchUserByLogin (String login){
        for (User user:users){
            if(user.getLogin().equals(login)){
                return user;
            }
        }
        throw new UserNotFoundException("Login not found");
    }
}
