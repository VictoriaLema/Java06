package homework;

public class HW3 {
    public static void main(String[] args) {
        int a = 7;
        int b = -3;

        if (a == b) {
            System.out.println("a equals b ");
        } else if ( a > b ) {
            System.out.println("a is bigger than b");
        } else {
            System.out.println(" b is bigger than a");
        }

        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        //3
         int c = 92;
        if (c > 10) {
            System.out.println("c bigger 10");
        }
        if (c < 100) {
            System.out.println("c less 100");
        }
        if (c / 2 > 20) {
            System.out.println(c / 2 );
        }
        if (c >= 5 && c <= 40) {
            System.out.println("between 5 and 40");
        } else {
            System.out.println(">40 or <5");
        }



    }
}
