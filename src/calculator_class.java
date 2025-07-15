public class calculator_class {
    public static void main(String[] args) {
        calculator.add(2,3);
        calculator sr = new calculator();
        sr.multiply(2,3);
    }
}
class calculator{
    static void add(int a,int b ){
        System.out.println(a+b);
    }
    void multiply(int a,int b){
        System.out.println(a*b);
    }
}