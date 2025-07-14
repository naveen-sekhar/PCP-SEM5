public class objects {
    public static void main(String[] args) {
        animal dog = new animal();
        dog.name = "Tommy";
        dog.age = 10;
        System.out.println(dog.name);
        System.out.println(dog.age);

        animal cat = new animal();
        cat.name = "kitty";
        cat.age = 5;
        System.out.println(cat.name);
        System.out.println(cat.age);
    }
}
class animal{
    String name;
    int age;
}