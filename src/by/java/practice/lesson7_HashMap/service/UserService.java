package by.java.practice.lesson7_HashMap.service;

import by.java.practice.lesson7_HashMap.Exceptions.NotCorrectPasswordException;
import by.java.practice.lesson7_HashMap.entity.User;
import by.java.practice.lesson7_HashMap.repository.UserRepository;

public class UserService {
    public User authentificate(String login, String password) {
        UserRepository userRepository = new UserRepository();
        User user = userRepository.searchUserByLogin(login);
        if (user.getPassword().equals(password)) {
            return user;
        }
        throw new NotCorrectPasswordException("login or password is incorrect");
    }
}
