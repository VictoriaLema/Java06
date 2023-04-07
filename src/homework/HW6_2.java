package homework;

import java.util.Arrays;

public class HW6_2 {

    public static void main(String[] args) {
        System.out.println("Task 1");
//        Задача №1
//
//        Дана строка:
        String s = "Перестановочный алгоритм быстрого действия";
//        необходимо вывести все буквы “о” из этой строки.
//        Для указанной строки ответ будет “ооооо” (или в столбик)
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='о') {
                System.out.print(s.charAt(i) + " ");
            }
        }
        System.out.println();
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.
        System.out.println("Task 2");
        String s1 = "“Перевыборы выбранного президента”";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)=='е') {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("Task 3");
//        Дана строка:
        String s2 = "Посмотрите как Рите нравится ритм";
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//                Для указанной строки ответ будет 6, 15, 29.
        s2 = s2.toLowerCase();
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'р' && s2.charAt(i + 1) == 'и'  && s2.charAt(i + 2) == 'т') {
                System.out.println(i);
            }
        }
        //вариант 2 с циклом while
        //indexOf используем
        int index = s2.indexOf("рит");
        while (index != -1) { //-1 равен, когла фолс, т.е. когда больше не находит
            System.out.println("index = " + index);
            index = s2.indexOf("рит",index + 1);
        }

       // Дан массив:
        System.out.println("Task 4");
        String[][] array = {
                {"Привет", "всем", "кто"},//0
                {"изучает", "язык", "программирования"}, //1
                {"java"} //2
        };
        count = array.length;

        for (int i = 0; i < array.length; i++) {
            if (Arrays.deepToString(array[i]).contains("е")) {
                count--;
            }
        }

        System.out.println(count);


      //  необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        //имелось в виду каждый элемент в массиве
        count = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
