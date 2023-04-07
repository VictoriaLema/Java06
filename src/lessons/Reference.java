package lessons;

import java.util.Arrays;

public class Reference {

    public static void main(String[] args) {
        String str = "Hello";
        String str2 = str;
        str= "Hi";


        Integer[] a = new Integer[5]; //null null null..., потому что референсный
        int[] b = new int[5];//0 0 0 0 ...

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        String str1 = "Sergey";
        System.out.println(str1.indexOf("r"));

        String strSergey = "Sergey is a programmer";
        strSergey = strSergey.replace("programmer", "teacher");//оверлоадид, поэтому можно не только чар,
        //но и чар сиквенс
        System.out.println(strSergey);

    }
}
