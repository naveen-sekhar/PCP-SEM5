import java.util.Arrays;
import java.util.Scanner;
public class college {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Ethical Hacking";
        System.out.println(str.substring(0,5));
//      System.out.println(str.toLowerCase().replaceAll("a",""));
        char [] str1 = str.toCharArray();
        Arrays.sort(str1);
        System.out.println(str1);
    }
}
