import java.util.Arrays;
import java.util.List;

public class Examples {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("111", "222", "333");

        doSth(list); //Exception

        System.out.println(list);
    }

    /**
     * @param list
     */
    private static void doSth(final List<String> list) {
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
    }

}
