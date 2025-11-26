package by.java.practice.lesson9_Stream;

import java.util.List;
import java.util.concurrent.Callable;

public class NumberGenerator implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println(name + " start");
        int result = numbers.stream().mapToInt(number -> number).sum();
        Thread.sleep(10000);
        System.out.println(name + " " + result);
        return String.valueOf(result);

    }

    private List<Integer> numbers;
    private String name;


    public NumberGenerator(List<Integer> numbers, String name) {
        this.numbers = numbers;
        this.name = name;
    }
}
