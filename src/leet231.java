import java.util.Scanner;

//Leetcode Problem 326 - Power of 3
//Leetcode Problem 231 - Power of 2
class Power{
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while(n%2 == 0){
            n /= 2; // n=4 , n=2, n=1
        }
        return n == 1;
    }
}
public class leet231 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(n+"is power of two? "+Power.isPowerOfTwo(n));
    }
}