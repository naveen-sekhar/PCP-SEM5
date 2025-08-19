// In an Online Examination system each student can submit their answer sheet only once.
// Write a java Program that takes in a list of a student id who have submitted their answer sheets and
// check whether any student has submitted more than once
import java.util.*;
public class model1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter roll number seperated by spaces : ");
        String input = s1.nextLine();
        String[] strArray = input.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i =0; i<strArray.length;i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    System.out.println("Duplicate Found "+ intArray[i]);
                }
            }
        }
    }
}
