import java.util.*;
import java.util.stream.Collectors;

public class Sandbox {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        ///////////////////////////////////

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //rownoznaczne z powyższym

        for (String element : list) {
            System.out.println(element);
        }

        ////////////////////

        list.forEach(e -> System.out.println(e));

        ////////////////////

        list.forEach(System.out::println);

        System.out.println("********KOLEKCJE********");
        //KOLEKCJE**********************************************

        List<String> listWithDups = new ArrayList<>();
        listWithDups.add("A");
        listWithDups.add("A");
        listWithDups.add("B");
        listWithDups.add("B");
        listWithDups.add("B");
        listWithDups.add("C");
        listWithDups.add("C");
        listWithDups.add("D");


        System.out.println("Lista z duplikatami");
        System.out.println(listWithDups.toString());

        Set<String> dupsSet = new HashSet<>(listWithDups);

        System.out.println("Set bez duplikatów");
        System.out.println(dupsSet);

        List<String> listWithoutDups = new ArrayList<>(dupsSet);

        System.out.println("List bez duplikatów");
        System.out.println(listWithoutDups);

        listWithoutDups = new ArrayList<>(
                new HashSet<>(listWithDups)
        );

        listWithoutDups = listWithDups.stream()
                .distinct()
                .collect(Collectors.toList());


        Set<ClassToTreeSet> treeSet = new TreeSet<>();

        treeSet.add(new ClassToTreeSet(6, "Prio 6"));
        treeSet.add(new ClassToTreeSet(3, "Prio 3"));
        treeSet.add(new ClassToTreeSet(1, "Prio 1"));
        treeSet.add(new ClassToTreeSet(8, "Prio 8"));
        treeSet.add(new ClassToTreeSet(7, "Prio 7"));
        treeSet.add(new ClassToTreeSet(9, "Prio 9"));
        treeSet.add(new ClassToTreeSet(9, "Prio 9.2"));

        System.out.println("*****************************************");
        System.out.println(treeSet);

        Set<ClassToTreeSet> hashSet = new HashSet<>();

        hashSet.add(new ClassToTreeSet(6, "Prio 6"));
        hashSet.add(new ClassToTreeSet(3, "Prio 3"));
        hashSet.add(new ClassToTreeSet(1, "Prio 1"));
        hashSet.add(new ClassToTreeSet(8, "Prio 8"));
        hashSet.add(new ClassToTreeSet(7, "Prio 7"));
        hashSet.add(new ClassToTreeSet(9, "Prio 9"));
        hashSet.add(new ClassToTreeSet(9, "Prio 9.2"));

        System.out.println("*****************************************");
        System.out.println(hashSet);

        Set<ClassToTreeSet> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(new ClassToTreeSet(6, "Prio 6"));
        linkedHashSet.add(new ClassToTreeSet(3, "Prio 3"));
        linkedHashSet.add(new ClassToTreeSet(1, "Prio 1"));
        linkedHashSet.add(new ClassToTreeSet(8, "Prio 8"));
        linkedHashSet.add(new ClassToTreeSet(7, "Prio 7"));
        linkedHashSet.add(new ClassToTreeSet(9, "Prio 9"));
        linkedHashSet.add(new ClassToTreeSet(9, "Prio 9.2"));

        System.out.println("*****************************************");
        System.out.println(linkedHashSet);


        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("K1", "V1");
        hashMap.put("Q2", "V2");
        hashMap.put("A4", "V4");
        hashMap.put("R5", "V5");
        hashMap.put("T6", "V6");
        hashMap.put("Y3", "V3");

        System.out.println("*****************************************");
        System.out.println(hashMap);

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("K1", "V1");
        linkedHashMap.put("Q2", "V2");
        linkedHashMap.put("A4", "V4");
        linkedHashMap.put("R5", "V5");
        linkedHashMap.put("T6", "V6");
        linkedHashMap.put("Y3", "V3");

        System.out.println("*****************************************");
        System.out.println(linkedHashMap);

        System.out.println("*****************************************");
        for (Map.Entry<String, String> x : hashMap.entrySet()) {
            System.out.println("Key: " + x.getKey() + " Value: " + x.getValue());
        }
        System.out.println("*****************************************");

        hashMap.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));

        System.out.println("*****************************************");

        Set<String> keySet = hashMap.keySet();

        for (String key : keySet) {
            System.out.println(hashMap.get(key));
        }
    }

}
