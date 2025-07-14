class factorial_using_methods{
    static int fact(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(fact(4)*fact(5));
    }
}