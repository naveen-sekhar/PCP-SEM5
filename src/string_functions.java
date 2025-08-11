import java.util.Scanner;

public class string_functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = sc.nextLine();
        if (input.isEmpty()){
            System.out.println("The String is Empty");
        }
        else {
            System.out.println("Entered String is : "+input);
            System.out.println("Length of the String is : "+input.length());
            System.out.println("Lower case : "+input.toLowerCase());
            System.out.println("Upper Case : "+input.toUpperCase());
            System.out.println("First Character : "+input.charAt(1));
            System.out.println("Substring : "+input.substring(0,Math.min(3,input.length())));
            System.out.println("Replace a with @ : "+input.replace("a","@"));
            System.out.println("contains 'Test' : "+input.contains("Test"));
            System.out.println("Starts with Hi : "+input.startsWith("Hi"));
            System.out.println("Ends with Bye : "+input.endsWith("Bye"));
        }
        String trimmed = input.trim();
        System.out.println("Trimmed String is : "+trimmed);

        String[] words = input.split(" ");
        for (String word : words){
            System.out.println("- "+word);
        }
    }
}