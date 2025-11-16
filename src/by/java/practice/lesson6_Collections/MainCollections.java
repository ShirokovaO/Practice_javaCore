package by.java.practice.lesson6_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainCollections {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task8();

//1. Условие
//1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
//1.2Добавить  пару записей (Привет, Как дела, Праздник, Суфле)
//1.3	Вывести все записи.
//1.4	Проверить, содержит ли коллекция слово Конфета
//1.5 Посчитать количество элементов в коллекции
    }

    public static void task1() {
        List<String> words = new ArrayList<>();
        String text1 = "Привет";
        String text2 = "Как дела";
        String text3 = "Праздник";
        String text4 = "Суфле";
        words.add(text1);
        words.add(text2);
        words.add(text3);
        words.add(text4);

        for (String text : words) {
            System.out.println(text);
        }

        boolean result = words.contains("Конфета");
        System.out.println("наличие в коллекции words слова Конфета: " + result);
        System.out.println("количество элементов в коллекции: " + words.size());
    }


    //2. Условие: Создайте ArrayList<String> для хранения списка покупок. Добавь в него 5 товаров. Затем выведите весь список на экран, а после — удалите один товар по названию и снова выведите обновлённый список.

    public static void task2() {
        System.out.println("**************************task2*******************************");

//        List <String> purchaseList = List.of("Хлеб","молоко","колбаса","пицца","вино");
        List<String> purchaseList = new ArrayList<>(List.of("Хлеб", "молоко", "колбаса", "пицца", "вино"));

        printPurchaseList(purchaseList);
        purchaseList.remove("молоко");
        System.out.println("** array after removing:");
        printPurchaseList(purchaseList);

    }

    private static void printPurchaseList(List<String> purchaseList) {
        for (String purchase : purchaseList) {
            System.out.println(purchase);
        }
    }

    //3. Условие: Создай класс Book с полями:
//•	String title
//•	String author
//3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
//3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false
//3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.
    public static void task3() {
        System.out.println("**********************task3*****************");
        Book book1 = new Book("Гарри Поттер", "Джоан Роулинг");
        Book book2 = new Book("Карлсон", "Астрид Линдгрен");
        Book book3 = new Book("Незнайка", "Николай Носов");
        List<Book> books = new ArrayList<>(List.of(book1, book2, book3));

        books.remove(book2);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    //4. Условие: Создай ArrayList<Integer> и заполни его числами от 1 до 10. Затем создай новый список, в который добавь только чётные числа из первого списка. Выведи оба списка.

    public static void task4() {
        System.out.println("********************task4*************");
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> numbersEven = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                numbersEven.add(number);
            } else
                continue;
        }
        System.out.println(numbersEven);

    }

    //8. Условие: Создай класс Book с полями:
//•	String title
//•	String author
//Создайте множество Set<Book> и добавьте в него несколько книг, включая дубликаты (одинаковое название и автор). Переопределите методы equals() и hashCode() так, чтобы книги с одинаковыми значениями title и author считались одинаковыми. Выведи содержимое множества и убедись, что дубликаты не добавляются.
    public static void task8() {
        System.out.println("**********************task8*****************");
        Book book1 = new Book("Гарри Поттер", "Джоан Роулинг");
        Book book2 = new Book("Гарри Поттер", "Джоан Роулинг");
        Book book3 = new Book("Незнайка", "Николай Носов");
        Set<Book> books1 = new HashSet<>();
        books1.add(book1);
        books1.add(book2);
        books1.add(book3);
        System.out.println(books1.toString());
    }

}
