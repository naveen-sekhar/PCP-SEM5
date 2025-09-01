public class abstraction {
    public static void main(String[] args) {
        cyber obj = new cyber();
        obj.uniform();
    }
}
abstract class Student{
    abstract void wd();
    void uniform(){
        System.out.println("Grey & Black");
    }
}
class cyber extends Students {
    void wd(){
        System.out.println("Cyber department works everyday");
    }
}
