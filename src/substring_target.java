public class substring_target {
    public static void main(String[] args){
        int count = 0;
        String input = "CosmopolitanHrfErkvLvtrkfcLhgbO";
        System.out.println(input.substring(3,5));;
        String target = "HELLO";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==target.charAt(count)){
                count = count+1;
            }
        }
        if (count==target.length()){
            System.out.println("It is present in the same order");
        }
    }
}

