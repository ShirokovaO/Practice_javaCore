package by.java.practice.lesson8_FileWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainFile {
    //Дан русский текст: Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов "живых" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.
//Использовать Reader, Writer
//1. Записать его в файл прописал относительный путь.
//2. Записать его в файл прописав абсолютный путь.
//3. Вычитать текст из первого файла.
//4. Вычитать текст из второго файла
// 5. Создать объект Ферма с полями. Выполнить сериализацию  2 ферм и десериализацию в файл. (интерфейс Externelizibel)
//1. Создать 5 потоков, каждый из которых вычисляет среднее арифметическое коллекции из 5 случайных целых чисел и выводит на экран. Потоки решать двумя способоами через класс Thread и интерфейс Runnable
    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
    }

    public static void first() {
        File file = new File("File.text");
//        File file = new File("");

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.");
        } catch (IOException e) {
            System.out.println("какой-то текст исключения");
        }

    }

    public static void second() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("File.text");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void third () {
        Farms farm1 = new Farms("sheep", 100);
        Farms farm2 = new Farms("cows", 85);
        ArrayList farms = new ArrayList<>();
        farms.add(farm1);
        farms.add(farm2);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("FileSerialized"))) {
            objectOutputStream.writeObject(farms);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fourth () {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("FileSerialized"))){
            System.out.println(objectInputStream.readObject());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
