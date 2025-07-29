import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=t.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Element"+(i+1)+":");
            array[i] = t.nextInt();
        }
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j+1]<array[j]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int a:array){
            System.out.println(a);
        }
    }
}