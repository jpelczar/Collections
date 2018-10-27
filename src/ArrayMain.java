import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class ArrayMain {

    public static void main(String[] args) {
        int[] arrayOfInts = new int[5];
        Integer[] arrayOfIntegers = new Integer[5];

        for (int element : arrayOfInts) {
            System.out.println(element);
        }

        System.out.println("-----------------------------");

        for (Integer element : arrayOfIntegers) {
            System.out.println(element);
        }

        arrayOfInts[0] = 5;
        arrayOfInts[1] = 31;
        arrayOfInts[4] = 12;

        System.out.println("-----------------------------");

        for (int element : arrayOfInts) {
            System.out.println(element);
        }

        System.out.println("-----------------------------");

        arrayOfInts[1] = 0;

        Arrays.stream(arrayOfInts).forEach(i -> System.out.println(i));

        System.out.println("-----------------------------");

        Stream.of(arrayOfInts).forEach(i -> System.out.println(i));

        System.out.println("-----------------------------");

        arrayOfIntegers[1] = 5;
        arrayOfIntegers[2] = 9;

        Stream.of(arrayOfIntegers).forEach(i -> System.out.println(i));

        System.out.println("-----------------------------");


        Random random = new Random();

        int a = random.nextInt(100); //0-99

        int gorna = 10;
        int dolna = 4;
        int b = random.nextInt(gorna - dolna + 1) + dolna; //4-10
    }
}
