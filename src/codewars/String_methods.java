package codewars;

import java.util.Arrays;

public class String_methods {

//    public static String[] array (String str) {
//
//        str.split(" ");
//
//    }
    public static String highAndLow(String numbers) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String [] arr =  numbers.trim().split(" ");
        int length = numbers.trim().split(" ").length;
        int[] arr1= new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.valueOf(arr[i]);
            }

        for (int i = 0; i < arr1.length;i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }

        return "" + max + " " +  min;
        }

    public static boolean getXO (String str) {

        int count1 = 0;
        int count2 = 0;
        char[] arr = str.toLowerCase().toCharArray();
        for (int i = 0; i< arr.length;i++){
            if (arr[i]=='x') {
                count1++;
            } else if(arr[i] =='o') {
                count2++;
            }
        }

        return count1 == count2;
    }

    //убирает первую и последнюю буквы
    public static String remove(String str) {

        return str.substring(1,str.length() - 1);
    }

   // Complete the solution so that it reverses all of the words within the string passed in.
   // Words are separated by exactly one space and there are no leading or trailing spaces.
   public static String reverseWords(String str){
        str = str.trim();
        String str1 = "";
        String[] arr = str.split(" ");
        String[]arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
           arr1[i] = arr[arr.length - i - 1];
           str1 += arr1[i] + " ";
       }

       return str1.trim();
   }

    //Complete the solution so that it reverses the string passed into it.
   // 'world'  =>  'dlrow'

    //проще было бы через чар эт решить
    public static String solution(String str) {
        char[] arr = str.toCharArray();
        char[] arr1 = new char[arr.length];
        String str1 = "";
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - i - 1];
            str1+=Character.toString(arr1[i]);
        }

        return str1;
    }

//    The goal of this exercise is to convert a string to a new string where each character in the new string
//    is "(" if that character appears only once in the original string, or ")" if that character appears more than once
//    in the original string. Ignore capitalization when determining if a character is a duplicate.
//
    public static String encode(String word) {

        char[] arr = new char[word.length()];
        word = word.toLowerCase() + " ";
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {

                if (word.charAt(i) == word.charAt(j)) {
                    arr[i] = ')';
                } else {
                    arr[i] = word.charAt(i);
                }
            }
        }
            String str = "";
            for (int i = 0; i < arr.length; i++) {
                str += String.valueOf(arr[i]);
            }

            return str;

        }

    public static void main(String[] args) {
        String str = " Robin Good";

        str = str.trim();
        System.out.println(str);
        System.out.println(Arrays.toString(str.trim().split(" ")));

        //  "Robin Singh" ==> ["Robin", "Singh"]

     //   "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

        System.out.println("Miledi".substring(0,"Miledi".length()));
        String numbers = "1 2 -3 4 5";
        System.out.println(highAndLow(numbers));
        String str1 = "xxyYy5";
        System.out.println(getXO(str1));

        System.out.println(reverseWords("The greatest victory is that which requires no battle"));
        System.out.println(solution("world"));

        System.out.println("Mary".indexOf('a'));
        System.out.println("Mary".indexOf('o'));

        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));





    }
}
