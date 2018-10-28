import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CollectionsEx1 {

    public static void main(String[] args) {

        List<Float> floatList = new LinkedList<>();

        Random random = new Random();

        double randomValue = Math.random();
        System.out.println("Random val: " + randomValue);

        while (randomValue > 0.01) {

            randomValue = Math.random();

            Float value = random.nextFloat() * 100.0f;
            floatList.add(value);

        }

        floatList.forEach(value ->
                System.out.println("Result: " + Math.PI * value));

    }

}
