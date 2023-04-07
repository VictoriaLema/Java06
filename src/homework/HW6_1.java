package homework;

public class HW6_1 {

    public static void main(String[] args) {
        System.out.println("Task 1");
        //Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива.
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
           sum+=array[i];
        }
        System.out.println(sum);

        System.out.println("Task 2");
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
       // необходимо вывести максимальное значение массива.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        System.out.println("Task 3");
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        // необходимо вывести минимальное значение массива.
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

        System.out.println("Task 4");
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        sum = 0;
        for (int i = 0; i < array1.length; i++) {
            count++;
            sum+=array1[i];
        }
        double result = sum * 1.0/count;
        System.out.println(result);

        System.out.println("Task 5");
//        Дан массив:
       int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.
        sum = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum+=array2[i][j];
            }
        }
        System.out.println(sum);

        System.out.println("Task 6");
        //необходимо вывести максимальное значение массива.
        max = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] > max) {
                    max = array2[i][j];
                }
            }
        }
        System.out.println(max);

        System.out.println("Task 7");
        //необходимо вывести количество элементов в массиве.
        count = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                count++;
            }
        }
        System.out.println(count);
        //второй вариант с 1 циклом
        count = 0;
        for (int i = 0; i < array2.length; i++) {
            count+=array2[i].length;
        }
        System.out.println(count);



    }

}
