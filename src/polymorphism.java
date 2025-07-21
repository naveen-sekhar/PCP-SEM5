public class polymorphism {
    public static void main(String[] args){
        Dog tommy = new Dog();
        tommy.play();
        tommy.food();
        tommy.sound();
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
class Dog extends Animal{
    void type(){
        System.out.println("Dogs are a domestic animal");
    }
    void play(){
        System.out.println("All animals play");
    }
    void sound(){ //Polymorphism
        System.out.println("Dogs Bark");
    }
}
class Cat extends Animal{
    void type(){
        System.out.println("Cats are a domestic animal");
    }
    void sound(){
        System.out.println("Cats Moew");
    }
}
