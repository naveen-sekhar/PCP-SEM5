public class palindrome_reverse {
    public static void main(String[] args) {
        int num = 12321;
        int copy = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (rev == copy) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}