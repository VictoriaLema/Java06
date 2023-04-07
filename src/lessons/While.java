package lessons;

public class While {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            //в скобках можно только 1 блок
            System.out.println("hi");
            i = i + 1;
        }
        System.out.println("end");

        i = 10;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 15);

    }
}
