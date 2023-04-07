package lessons;

public class Ifelse {

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        if (a % 2 == 0) {
            b = 6;
            //  это позволило нам поменять переменную при выполнении определенного условия
        }

        //1
        a = 8;
        if (a % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");

            if (a == 8) {
                System.out.println("8");
            } else {
                System.out.println("not 8");
            }
        }
        //2
        a = 10;
        if (a % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");

            if (a == 8) {
                System.out.println("8");
            } else {
                System.out.println("not 8");
            }
        }
        //3
        a = 9;
        if (a % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
//сюда даже не пойдет в код
            if (a == 8) {
                System.out.println("8");
            } else {
                System.out.println("not 8");
            }
        }

        System.out.println("a % 2 != 0 is " + (a % 2 != 0));
    }
}

