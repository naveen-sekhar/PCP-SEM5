public class Static_non_static {
    public static void main(String[] args) {
        // You cannot access a non-static method without creating an object
        claculator SR = new claculator(); // To access Non-Static Method
        SR.add(2,3);
        // Otherwise you have to declare the non-static method as static
        claculator.add(3,5); // To access a Static method
        SR.multiply(2,3);
    }
}
class claculator {
    static void add(int a,int b){
        System.out.println("Addition : "+a+b);
    }
    void multiply(int a,int b) {
        System.out.println("Multiplication : "+a * b);
    }
}
