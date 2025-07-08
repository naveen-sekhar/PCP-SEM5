// If else if example
import java.util.*;
class if_else_if {
    public static void main(String[] args) {
        Scanner SR =  new Scanner(System.in);
        System.out.print("Enter a number : ");
        float num = SR.nextFloat();
        if (num%2==0 && num!=0){
            System.out.println("The number is even");
        } else if (num%2==1) {
            System.out.println("The number is odd");
        }
        else{
            System.out.println("Neither Even nor Odd");
        }
    }
}