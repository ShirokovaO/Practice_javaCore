package by.java.practice.lesson3_ClassesStrings;

public class StringClass {
    //            2. Распечатать последний символ строки. Используем метод String.charAt().
//            3. Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().
//        10. Вырезать строку Java c помощью метода String.substring().


    public static void main(String args[]) {
        String str = "I like Java";
        int length = str.length();
        char resultChar = str.charAt(length - 1);
        System.out.println(resultChar);

        boolean isTrue = str.endsWith("java!");
        System.out.println("заканчивается ли ваша строка подстрокой = " + isTrue);

        String resultStr = str.substring(7, 11);
        System.out.println(resultStr);
        int indexStart = str.indexOf("Java");
        String strJava = "Java";
        String resultStrFinal = str.substring(indexStart, indexStart + strJava.length());
        System.out.println(resultStrFinal);


    }


}
