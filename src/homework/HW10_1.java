package homework;

import java.util.Arrays;

public class HW10_1 {
    //Complete the method that takes a boolean value and
    // return a "Yes" string for true, or a "No" string for false.
    public static String returnTrueOrFalse(boolean b) {

        if (b) {
            return "Yes";
        } else {
            return "No";
        }
    }

    //    Your task is to create a function that does four basic mathematical operations.
//
//    The function should take three arguments - operation(string/char), value1(number), value2(number).
//    The function should return result of numbers after applying the chosen operation.
//    ('+', 4, 7) --> 11
//            ('-', 15, 18) --> -3
//            ('*', 5, 5) --> 25
//            ('/', 49, 7) --> 7
    public static int computeMathOperations(char operation, int n1, int n2) {
        int result;

        if (operation == '+') {
            result = n1 + n2;
        } else if (operation == '-') {
            result = n1 - n2;
        } else if (operation == '*') {
            result = n1 * 2;
        } else if (operation == '/' && n2 != 0) {
            result = n1 / n2;
        } else {

            return Integer.MIN_VALUE;
        }

        return result;
    }

    //Build a function that returns an array of integers from n to 1 where n>0.
    // Example : n=5 --> [5,4,3,2,1]
    public static int[] getArrayFromNToOne(int n) {
        int[] array = new int[n];
        for (int i = 0; n > 0; i++, n--) {
            array[i] = n;
        }

        return array;
    }

    //Write a function to split a string and convert it into an array of words.

    public static String[] convertStringIntoArray(String str) {

        return str.trim().split(" ");
    }

//    Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.
//   When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.
//   Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
//    S is misinterpreted as 5
//    O is misinterpreted as 0
//    I is misinterpreted as 1

    public static String correctTypoFromNumbers(String str) {
        return str.replace('0','O').replace('1','I').replace('5','S');
    }

    public static void main(String[] args) {

        System.out.println(returnTrueOrFalse(true));
        System.out.println(returnTrueOrFalse(false));

        System.out.println(computeMathOperations('*', 2, 3));
        System.out.println(computeMathOperations('/', 49, 7));
        System.out.println(computeMathOperations('/', 49, 0));
        System.out.println(computeMathOperations('-', 49, 5));
        System.out.println(computeMathOperations('%', 49, 5));

        System.out.println(Arrays.toString(getArrayFromNToOne(5)));

        System.out.println(Arrays.toString(convertStringIntoArray("Robin Good")));
        System.out.println(Arrays.toString(convertStringIntoArray("I love arrays they are my favorite")));
        System.out.println(correctTypoFromNumbers("1 AM VERY HAPPY T0 5EE YOU 1N MY H0U5E"));

    }
}
