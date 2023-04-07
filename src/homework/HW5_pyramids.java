package homework;

public class HW5_pyramids {
    //   Задачи на циклы, вывести следующие строки с соответствующим форматированием
    //          (как пирамиды):

    // Задача No1
//0 1 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8
//        0 1 2 3 4 5 6 7
//        0 1 2 3 4 5 6
    //       0 1 2 3 4 5
    //      0 1 2 3 4
    //      0 1 2 3
    //     0 1 2
    //     0 1
    //     0

    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

//        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//        8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//        7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//        6 5 4 3 2 1 0 1 2 3 4 5 6
//        5 4 3 2 1 0 1 2 3 4 5
//        4 3 2 1 0 1 2 3 4
//    3 2 1 0 1 2 3
//       2 1 0 1 2
//         1 0 1
//          0
        for (int i = 10; i > 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = i-1; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 0; j < i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        //2 loops
        for (int i = 10; i > 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = -i+1; j < i; j++) {
                System.out.print(Math.abs(j) + " ");
            }
            System.out.println();
        }

        for (int i = 10; i > 0; i--) {
            for (int j = -9; j < i; j++) {
                if (Math.abs(j)< i){
                    System.out.print(Math.abs(j) + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }









    }




    }

