import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch_2 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a index position of String : ");
        int str1 = sc.nextInt();
        try {
            System.out.println("Character at index position "+str1+" is "+str.charAt(str1-1));
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalid Input");
        } catch (InputMismatchException e) {
            System.out.println("Index position is invalid");
        } finally{
            sc.close();
        }
    }
}
