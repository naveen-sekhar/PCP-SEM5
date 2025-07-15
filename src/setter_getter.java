public class setter_getter {
    public static void main(String[] args) {
        SRET.uniform();
        SRET ramu = new SRET();
        ramu.rollnumber = 12345;
        ramu.display();
        SRET somu = new SRET();
        ramu.change_pin(3456);
        ramu.display_pin();
    }
}
class SRET{
    private int PIN = 1234;
    void display_pin(){
        System.out.println("Pin Number : "+this.PIN);
    }
    void change_pin(int pin){
        this.PIN = pin;
    }
    static int rollnumber;
    static void uniform(){
        System.out.println("Grey & Black");
    }
    void display(){
        System.out.println(rollnumber);
    }
}