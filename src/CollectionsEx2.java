import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CollectionsEx2 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();

        employeeMap.put("abc123", "Imie1 Nazw1");
        employeeMap.put("abc456", "Imie2 Nazw2");
        employeeMap.put("abc789", "Imie3 Nazw3");
        employeeMap.put("def123", "Imie4 Nazw4");
        employeeMap.put("dEf456", "Imie5 Nazw5");

//        System.out.println(employeeMap.get("abc123") + " _ " +
//                employeeMap.get("ABC123".toLowerCase()));

        Scanner scanner = new Scanner(System.in);

//        System.out.println(employeeMap
//                .get(scanner.next().toLowerCase()));

        String idFromUser = scanner.next(); //def456

        Set<String> keySet = employeeMap.keySet(); //dEf456
        for (String key : keySet) {
            if (idFromUser.equalsIgnoreCase(key)) {
                System.out.println(employeeMap.get(key));
            }
        }
    }

}
