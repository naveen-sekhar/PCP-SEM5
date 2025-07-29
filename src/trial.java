public class trial {
    public static void main(String[] args) {
        //domestic.type();
        Dug tommy=new Dug();
        tommy.pet();

    }
}
class Animul {
    void sound(){
        System.out.println("All animals make sound");
    }
}
class Dug extends Animul implements domestic{
    void sound(){
        System.out.println("All dogs bark");
    }

    public void pet(){
        System.out.println("Dogs are pet animals");
    }
}
interface domestic {
    static void type(){
        System.out.println("Domestic animals are ususally friendly");
    }
    void pet();
}