import java.util.*;
public class list1 {
    static void generateSubset(int[] arr,int index,List <Integer> current){
        if (index == arr.length){
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        generateSubset(arr,index + 1,current);
        current.remove(current.size()-1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("All Subsets are : ");
        generateSubset(nums,0,new ArrayList<>());

    }
}