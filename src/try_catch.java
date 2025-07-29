import java.util.InputMismatchException;
import java.util.Scanner;
public class try_catch {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sr.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Thank you for using this program.");
        } finally {
            System.out.println("Program finished.");
            sr.close();
        }
    }
}