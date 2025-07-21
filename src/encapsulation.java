public class encapsulation {
    public static void main(String[] args){
        Secret anu = new Secret();
        //Private variables can only be accessed by calling the method inside the class
        anu.display();
        anu.update(3456);
        Secret ramu = new Secret();
        ramu.display();
        ramu.update(7890);
    }
}
class  Secret{
    // Creating a private variable so only authorized users can access
    // Private variables can only be accessed by creating a method inside the class
    private int PIN = 1234;
    void display(){
        // "this." keyword is used to ensure it's pulling the right user or object
        System.out.println("Pin Number : "+this.PIN);
    }
    void update(int pin){
        PIN = pin;
        System.out.println("Changed Pin Number : "+PIN);
    }
}

