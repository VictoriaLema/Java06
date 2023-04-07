package lessons;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        int[] array = {10, 100, 1000, 10000, 100000};
        System.out.println(array[1]);

        System.out.println(array.length);
        array[2] = 15;
        System.out.println(Arrays.toString(array));

        int[] array2 = array;
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "->" + array[i]);
        }

        //выводим 6 степеней пятерки

        int[] array1 = new int[6];
        for (int i = 0, p = 1; i < array1.length; i++, p*=5) {
            array1[i] = p;
        }
        System.out.println(Arrays.toString(array1));

        //2 вариант
        int[] array11 = new int[6];
        int p = 1;
        for (int i = 0; i < array11.length; i++) {
            array1[i] = p;
            p*=5;
        }
        System.out.println(Arrays.toString(array1));

        //2мерные массивы

        int [][] arr = {
                {1,10,100},
                {2,20,200},
                {3,30,300}
        };
        System.out.println(Arrays.deepToString(arr));

        int [][] arr1 = {
                {1,10,100,1000},
                {2,20},
                {3,30,300}
        };
        System.out.println(arr1[2][2]);

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                System.out.print(arr1[i][j] + " ");

            }
        }
    }

}
