package lessons;

public class Arraysminmax_count_sum3Darray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 8, 2, 4, 6};
        int result = arr[0];
        //min
        for (int i = 0; i < arr[i]; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }
        System.out.println(result);

        //max
        result = arr[0];
        for (int i = 0; i < arr[i]; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        System.out.println(result);

        //summa
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

        //количество элементов в массиве
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println(count);

        //сумма в 2мерном массиве
        int[][] arr2d = {
                {10, 5},
                {3, 8, 2},
                {},
                {6}
        };
        sum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                sum+=arr2d[i][j];
            }
        }
        System.out.println(sum);

        //min in 2d array
        int min = arr2d[0][0];//лучше Интежер макс
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (min > arr2d[i][j]) {
                    min = arr2d[i][j];
                };
            }
        }
        System.out.println(min);

    }
}
