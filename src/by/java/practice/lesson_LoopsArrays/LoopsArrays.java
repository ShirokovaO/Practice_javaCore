package by.java.practice.lesson_LoopsArrays;

import java.util.Arrays;

public class LoopsArrays {
    static void main() {
//        1. Необходимо, чтобы программа отображала следующую последовательность чисел:
//        7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int a=7; a<97;){
            a= a+7;
            System.out.println(a);
        }

//        2. Необходимо вывести следующую последовательность цифр:
//        1 2 4 8 16 32 64 128 256 512
        int b=1;
        do {
            System.out.println(b);
            b=b*2;
        }
        while (b<513);

//        3. Написать программу, которая посчитает сумму первых 10 чисел
        int i=1;
        int j=10;
        int r=0;
        while (i<j){
            r=r+i;
            i++;
        }
        System.out.println(r);

//        4. Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой
        for (int i1 = 100; i1 >= 1; i1--) {
            System.out.print(i);
            if (i1 > 1) {
                System.out.print(",");
            }
        }
//        5. Вывести числа от 1 до 100.
        int x=1;
        while (x<=100){
            System.out.print(" " + x);
            x++;
        }

//        6. Вывести только нечётные числа от 1 до 100.
        int s=1;
        while(s<=100){
            if(s%2==0){
                s++;
            }
            else {
                System.out.print(" " + s);
                s++;
            }
        }

//        7. Вывести каждый десяток от 1 до 100.
        int i2 = 10;
        while (i2 <= 100) {
            System.out.println(" " + i2);
            i2 += 10;
        }

//        8. Создать массив из чисел. Вывести макс и мин число.
        int[] massive = {10, 3, 4, 1, 6};
        int min = massive[0];
        int max = massive[0];

//        for (int i = 0; i < massive.length; i++) {
//            if (massive[i] < min) {
//                min = massive[i];
//
//            }
//            if (massive[i] > max) {
//                max = massive[i];
//
//
//            }
//
//        }
//        System.out.println("минимальное значение = " + min);
//        System.out.println("максимальное значение = " + max);

        for (int l:massive){
            if (l < min) {
                min = l;

            }
            if (l > max) {
                max = l;

            }
        }
        System.out.println("минимальное значение = " + min);
        System.out.println("максимальное значение = " + max);

//        9. Создать массив чисел от 1 до 100. Вывести полученный массив.
//        10. Сортировать массив чисел. Сортирвка пузырьком


    int [] arr = {23, 43, 23, 42, 13, 4, 1, 4, 9};
        for (int
             n = arr.length - 1; n >= 0; n--) {
            for (int m = 0; m < n; m++) {
                if (arr[m] > arr [m + 1]) {
                    int buffer = arr[m];
                    arr[m] = arr[m + 1];
                    arr[m + 1] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

//        11. Ввести число с консоли, которое не заканчивается на 0.
//        Вывести среднее значение всех цифр в числе. Использовать оператор %.(цикл while)
    }
}
