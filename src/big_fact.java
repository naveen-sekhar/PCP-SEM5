public class big_fact {
    public static void main(String[] args) {
        System.out.println((fact(9)*fact(7)/(fact(2)*fact(4))+(fact(8)*fact(11)/(fact(3)*fact(7)))));
    }
    static int fact(int a){
        if (a==1) return 1;
        else return a*fact(a-1);
    }
}
