// Leetcode Problem number - 50
import java.util.Scanner;
class exponent{
    public static Double power(int x,int n){
        double result = 1;
        for(int i=1;i<=n;i++) result*=x;
        if (n<0) return 1/+result;
        else return result;
    }
}
public class expo {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base number : ");
        int base = sc.nextInt();
        System.out.print("Enter the Exponent number : ");
        int expo = sc.nextInt();
        System.out.println(base + "^" + expo + "=" + exponent.power(base,expo));
    }
}