public class palindrome_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int num = 0;
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length-1-i]) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}