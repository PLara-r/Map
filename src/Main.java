import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");  // bamboo
        for (String key: map.keySet())
            System.out.print(key + ","); // koala,giraffe,lion,



        Map<String, String> map1 = new TreeMap<>();
        map1.put("koala", "bamboo");
        map1.put("lion", "meat");
        map1.put("giraffe", "leaf");
        String food1 = map1.get("koala");  // bamboo
        for (String key: map1.keySet())
            System.out.print(key + ","); // giraffe,koala,lion,


    }
}
