package lessons;

public class For {

    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
        }

        int a;
        for (a = 1; a < 10; a = a + 3 ) {
            System.out.println(a);
        }

        //можно вниз идти
        for (int i = 10; i > 0; i = i - 3) {
            System.out.println(i);
        }

        //со Стрингами
        String str = "qwerty";
        int limit = 20;
        for (; str.length() < limit + 1;) {
            str = str + "*";
        }
        System.out.println(str);
//2 variant
        str = "qwerty";
        for (; str.length() < limit + 1; str = str + "*") {

        }
        System.out.println(str);
    }

}
