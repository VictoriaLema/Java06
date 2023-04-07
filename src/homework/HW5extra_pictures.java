package homework;

public class HW5extra_pictures {
    public static void main(String[] args) {
        
        for (int i = 8; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 9-i ; j >=1 ; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <10-i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}



