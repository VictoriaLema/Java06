package homework;

public class HW4 {
    public static void main(String[] args) {
        //1 Необходимо вывести числа от 0 до 15.
        System.out.println("1");
        for (int i = 0; i < 16; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("2");
        //Необходимо вывести все положительные степени числа 5 которые меньше 10000,
        //вывести результат возведения в степень.
        for (int i = 5; i < 10000; i = i * 5) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("3");
        //Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        //Реализовать 2 варианта:
        //● использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        //● без использования конструкции if (шаг цикла на ваше усмотрение).
        for (int i = 40; i < 61; i = i + 1) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 40; i < 61 ; i = i + 4) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача с расстояниями");
        for (int i = 0, j = 18; i <=j; i+=2,j-=3) {
            if (i == j) {
                System.out.println(i + "\uD83D\uDE38");
            } else {
                System.out.println("\uD83D\uDE3E");
            }
        }

        System.out.println("Задача с корнями");
        int num = 7;
        for (int i = 1; num - i * i >= 0; i++) {
            System.out.println(num - i * i);
        }

        //break
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
        //распечатает 6 последнее

        //break
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 7) {
                break;
            }
        }
        //распечатает 7 последнее

        //continue

        for (int i = 0; i < 10; i++) {
            if (i == 7 || i == 9) {
                continue;
            }
            System.out.println(i);
        }
       // распечатает без 7 и 9

        //Вложенные циклы
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 7 ; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
