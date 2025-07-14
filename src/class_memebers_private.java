public class class_memebers_private {
    public static void main(String[] args) {
        animals dog = new animals();
        dog.setage(5);
        dog.getage();
    }
}
class animals {
    private int age;
    void setage (int age){
        this.age = age;
    }
    void getage (){
        System.out.println(this.age);
    }
}
