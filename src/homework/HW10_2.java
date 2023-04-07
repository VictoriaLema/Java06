package homework;

import java.util.Arrays;

public class HW10_2 {
//    Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//
//    The output should be two capital letters with a dot separating them.
    public static String convertIntoInitials (String str) {

        return (str.charAt(0) + "." + str.charAt(str.indexOf(" ") + 1)).toUpperCase();
    }

//    All of the animals are having a feast! Each animal is bringing one dish. There is just one rule:
//    the dish must start and end with the same letters as the animal's name. For example, the great blue heron
//    is bringing garlic naan and the chickadee is bringing chocolate cake.
//    Write a function feast that takes the animal's name and dish as arguments
//    and returns true or false to indicate whether the beast is allowed to bring the dish to the feast.
//    Assume that beast and dish are always lowercase strings,
//    and that each has at least two letters. beast and dish may contain hyphens and spaces,
//    but these will not appear at the beginning or end of the string. They will not contain numerals.
    public static boolean feast(String beast, String dish) {
        beast = beast.trim();
        dish = dish.trim();
        if (beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1)){
            return true;
        } else {
            return false;
        }
    }

    public static String tripleTrouble (String one, String two, String three) {
        String str = "";
        if (one.length() == two.length() && two.length() == three.length()) {
            for (int i = 0; i < one.length(); i++) {
                str = str + one.charAt(i) + two.charAt(i) + three.charAt(i);
            }
        } else {

            return "Error in length";
        }

        return str;
        }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int a1 = 0;
        int a2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            a1 = a1 + arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            a2 = a2 + arr2[i];
        }
        return a1 + a2;
    }

    public static String position(char alphabet) {
       // int positon =  alphabet- 96;

        return "Position of alphabet: " + (alphabet - 96);
    }





    public static void main(String[] args) {

        System.out.println(convertIntoInitials("Sam Harris"));
        System.out.println(convertIntoInitials("patrick feeney"));

        System.out.println(feast("chicadee", "chocolate cake"));
        System.out.println(feast(" chicadee", "chocolate cake"));
        System.out.println(feast(" hyena", "hawaian pizza"));
        System.out.println(feast("chicken", "chopped cabbage"));
        System.out.println(feast("chicken", "hopped cabbagen"));

        System.out.println(tripleTrouble("aa","bb","cc"));
        System.out.println(tripleTrouble("this","test","lock"));
        System.out.println(tripleTrouble("thise","test","lock"));

        System.out.println(position('b'));
        System.out.println(position('m'));

        System.out.println(arrayPlusArray(new int[]{-7, 2, 7}, new int[]{2, 1, -7}));






    }
}
