package by.java.practice.lesson7_HashMap;

import by.java.practice.lesson7_HashMap.Exceptions.NotCorrectPasswordException;
import by.java.practice.lesson7_HashMap.Exceptions.UserNotFoundException;
import by.java.practice.lesson7_HashMap.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
//    Задача 1
//            1. Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых ключ>5. Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки>5.
//
//    Задача 2
//            1. Создать класс пользователь. Поля логин, пароль, имя, фамилия.
//            2. Создать класс UserRepository. Внутри класса создать статическую переменную List<User> users.
//            3. Выполнить инициаизацию коллекции в статическом блоке. Создать 5 пользователей и заполнить поля.
//            4. Создать класс сервис. Реализовать в этом классе метод аутенфикации  пользователя (void authenticate (String login, String password). Этот метод должен проверять наличие пользователя в репозитории по логину. Если пользователя нет, то выбрасываем собственное исключение (UserNotFoundException)
//5. В этом же методе выполнить проверку пароля пользователя, если по логину мы его нашли. Если пароль не совпадает, то выбрасываем собственное исключение NotCorrectPasswordException.
//            6. В классе main при вызове метода аутенфикации перехватите исключение UserNotFoundException и выведите в консоль (нет пользователя)
//7. Также перехватите оставшиеся исключения и в блоке catch выведите в консоль сообщение (Вы не прошли аутенфикацию)
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "apple");
        myMap.put(2, "dog");
        myMap.put(3, "cat");
        myMap.put(4, "pineapple");
        myMap.put(5, "elephant");
        myMap.put(6, "tomato");
        myMap.put(7, "aperol");
        myMap.put(8, "jinn");
        myMap.put(9, "beer");
        myMap.put(10, "wine");
        int multyKey = 1;
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            Integer key = entry.getKey();

            if (key > 5) {
                System.out.println("строка с ключом > 5: " + entry.getValue());
            }
            if (key == 0) {
                System.out.println(myMap.values());
            }
            if (entry.getValue().length() > 5) {
                multyKey = key * multyKey;
            }
        }
        System.out.println("перемноженные ключи = " + multyKey);
        System.out.println("**********************задание 2************************");

        try {
            UserService userService = new UserService();
            userService.authentificate("login", "test");
        } catch (NotCorrectPasswordException notCorrectPasswordException) {
            System.out.println("Вы не прошли аутенфикацию");

        } catch (UserNotFoundException userNotFoundException){
            System.out.println("нет пользователя");
        }


    }
}
