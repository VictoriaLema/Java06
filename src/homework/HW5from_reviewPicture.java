package homework;

import java.util.Arrays;

public class HW5from_reviewPicture {
    //при заданном радиусе и рамке нарисовать круг
    public static void main(String[] args) {
        int radius = 15;
        //l = x*x +y*y = r * r;
        //это окружность, вписанная в квадрат

        for (int y = radius; y >= -radius; y--) {
            for (int x = - radius; x <=radius ; x++) {
                if ((x * x + y * y) <= radius * radius) {
                    System.out.print("MM");
                } else {
                    System.out.print("**");
                }
            }
            System.out.println();
        }

        //c рамкой
        int frame = 3;
        for (int y = radius + frame; y >= -radius - frame; y--) {
            for (int x = - radius - frame; x <=radius + frame; x++) {
                if ((x * x + y * y) <= radius * radius) {
                    System.out.print("MM");
                } else {
                    System.out.print("**");
                }
            }
            System.out.println();
        }
        System.out.println();

        //окружность
        for (int y = radius; y >= -radius; y--) {
            for (int x = - radius; x <=radius ; x++) {
                if ((x * x + y * y) == radius * radius) {
                    System.out.print("MM");
                } else {
                    System.out.print("**");
                }
            }
            System.out.println();
        }

        int [][] array = {
                {7, 5, 3, 11},
                {2, -2, 15, 25},
                {6, 14, 0, 30},
                {11, 27, 35, 45}
        };
        int [][] array2 = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array2[i][j] = array[j][i];
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        //вариант без доп переменных
        int [][] array3 = {
                {7, 5, 3, 11},
                {2, -2, 15, 25},
                {6, 14, 0, 30},
                {11, 27, 35, 45}
        };

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < i; j++) {
                if (i < j) {
                    int l = array3[i][j];
                    array3[i][j] = array3[j][i];
                    l = array3[j][i];
                }
            }
            System.out.println(Arrays.toString(array3[i]));
        }

    }
}
