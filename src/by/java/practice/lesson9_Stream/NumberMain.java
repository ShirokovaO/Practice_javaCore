package by.java.practice.lesson9_Stream;

import java.util.List;
import java.util.concurrent.*;

public class NumberMain {
    public static void main(String[] args) {
        // Задание №3
//Создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых чисел -> засыпает произвольно на 1-10 секунд, результат выполнения – сумму этих чисел в виде строки. Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.
        List<Integer> number1 = List.of(2, 6, 4, 9);
        List<Integer> number2 = List.of(55,4,7,3);
        List<Integer> number3 = List.of(1,22,34,4);
        List<Integer> number4 = List.of(2,44,66,77);


        NumberGenerator numberGenerator = new NumberGenerator(number1, "first");
        NumberGenerator numberGenerator1 = new NumberGenerator(number2, "second");
        NumberGenerator numberGenerator2 = new NumberGenerator(number3,"third");
        NumberGenerator numberGenerator3 = new NumberGenerator(number4, "fourth");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future1 = executorService.submit(numberGenerator1);
        Future<String> future2 = executorService.submit(numberGenerator2);
        Future<String> future3 = executorService.submit(numberGenerator);
        Future<String> future4 = executorService.submit(numberGenerator3);


//        try {
//            future1.get();
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }

    }




}
