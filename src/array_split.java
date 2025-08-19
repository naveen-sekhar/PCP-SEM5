import java.util.*;
public class array_split {
    public static void main(String[] args) {
        Scanner n =  new Scanner(System.in);
        System.out.println("Enter the integers to be seperated : ");
        String input1 = n.nextLine(); // Taking Input from the user
        String[] strArray = input1.split(" "); // Splitting the strings
        int[] intArray = new int[strArray.length]; // Passing the strings into the int array
        for (int i = 0; i< strArray.length; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        System.out.println("Converted Integer Array : ");
        for (int num : intArray){ // Another way of using for loop
            System.out.println(num);
        }
        n.close();
    }
}
