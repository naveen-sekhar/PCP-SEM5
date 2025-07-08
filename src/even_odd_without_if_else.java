import java.util.Scanner;
public class even_odd_without_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println((num%2==0)?"Even":"Odd");
    }
}