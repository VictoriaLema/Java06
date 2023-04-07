package homework;

public class HW10_3 {
    public static String remove(String str) {

        return str.substring(1,str.length()-1);
    }

//    You're writing code to control your town's traffic lights. You need a function to handle each change from green,
//    to yellow, to red, and then to green again.
//    Complete the function that takes a string as an argument representing the current state of the light and
//    returns a string representing the state the light should change to.
//    For example, when the input is green, output should be yellow.

    public static String updateLight(String current) {
        if (current.equals("green")) {

            return "yellow";
        } else if (current.equals("yellow")) {

            return "red";
        } else if (current.equals("red")) {

            return "green";
        }

        return "Error";
    }



    public static void main(String[] args) {

        System.out.println(remove("anna"));
        System.out.println(remove("I am Victoria"));

    }
}
