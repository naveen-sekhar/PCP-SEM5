import java.util.Scanner;
public class add_function {
    static void add(int num,int num1){
        int sum = num+num1;
        System.out.print("The sum is "+sum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int num1 = input.nextInt();
        add(num,num1);
    }
}