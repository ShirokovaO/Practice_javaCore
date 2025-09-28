package by.java.practice.lesson1;

import java.util.Scanner;

public class Lesson1 {
    static void main(String[] args) {

        //1. Дано уравнение: (10+12)*x=88;. Найти значение x.

        int x=88/(10+12);

        System.out.println("task1: \n" + "x = " + x);
        System.out.println("**********************************************\n" + "task4: \n");

        //4. Введите x,y,z. К числу x прибавьте y, число y умножьте на z.
        // Используйте операции присваивания.
        // * Результат выведите в косноль

        Scanner in = new Scanner(System.in);
        System.out.println("Введите х");
        int x1=in.nextInt();
        System.out.println("Введите y");
        int y=in.nextInt();
        System.out.println("Введите z");
        int z=in.nextInt();

        x1+=y;
        y*=z;

        System.out.println(x1 + " \n" + y);
        System.out.println("**********************************************\n" + "task5: \n");

        // 5. Дано уравнение 213/x+258/x+60=217. найдите х

        double x3 = (213+258)/(217-60);

        System.out.println("x = " + x3);
        System.out.println("**********************************************\n" + "task6: \n");

        //6. Даны значения: x=5; y=2; c=x*y;
        // * 6.2 Расставьте операции инкремента декремента так,
        // * чтобы после выполнения операции (c=x*y) с=10; x=6; y=1

        int x4=5;
        int y1=2;
        int c = x4++*y1--;


        System.out.println("c = " + c + "\nx = " +x4 + "\ny = " +y1);

        /* 1. Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную.
        Иначе если a=b  вывести сумму этих чисел.
        Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.*/

        System.out.println("Введите a");
        int a=in.nextInt();
        System.out.println("Введите b");
        int b=in.nextInt();

        if (a>b){
            int c1=a-b;
            System.out.println("разница a и b = " + c1);
        } else if (a==b) {
            System.out.println("сумма a и b = " + (a+b));
        } else
            System.out.println("разница между b и a = " + (b-a));

    }

}
