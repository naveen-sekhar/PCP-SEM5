import java.util.HashMap;
class fake {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        map.put("Apple",10);
        map.put("Orange",20);
        map.put("Banana",30);
        map.put("Mango",40);
        map.put("Grapes",50);
        map.put("Pineapple",60);
        map.put("Watermelon",70);
        map.put("Kiwi",80);
        map.put("Pear",90);
        map.put("Strawberry",100);
        for (String key : map.keySet()) {
            System.out.println(key+" "+map.get(key));
        }
    }
}