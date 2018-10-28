import java.util.HashMap;
import java.util.Map;

public class CollectionsEx3 {

    public static void main(String[] args) {

        Map<String, String> dict = new HashMap<>();

        dict.put("kot", "cat");
        dict.put("pies", "dog");

        String word = "Ala KOT pies";

        String[] wordArray = word.split(" ");

        String result = "";

        for (String item : wordArray) {
            if (dict.containsKey(item.toLowerCase())) {
                result += dict.get(item.toLowerCase());
            } else {
                result += item;
            }
            result += " ";
        }

        System.out.println(result);
    }

}
