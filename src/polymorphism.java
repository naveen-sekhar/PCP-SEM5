public class polymorphism {
    public static void main(String[] args){
        Dug tommys = new Dug();
        tommys.sound();
        Cat kitty = new Cat();
        kitty.sound();
    }
}
abstract class Animal{
    abstract void type();
    void sound(){
        System.out.println("All animals makes sound...");
    }
    void food(){
        System.out.println("All animals need food");
    }
    void character(){
        System.out.println("All animals are unpredictable");
    }
}
class Dog extends Animul {
    void type(){
        System.out.println("Dogs are a domestic animal");
    }
    void play(){
        System.out.println("All animals play");
    }
    void sound(){ //Polymorphism
        System.out.println("Dogs Bark");
    }

    void pet() {
    }
}
class Cat extends Animul {
    void type(){
        System.out.println("Cats are a domestic animal");
    }
    void sound(){
        System.out.println("Cats Moew");
    }
}
