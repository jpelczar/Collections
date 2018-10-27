public class Zad5 {

    public static void main(String[] args) {

        Queue<Person> personQueue = new ArrayQueue<>();

        Person zosia = new Person("Zosia", Sex.FEMALE);

        if (personQueue.isEmpty()) {
            personQueue.push(zosia);
        } else {
            Person personFromQueue = personQueue.peek();
            if (personFromQueue.getSex().equals(Sex.MALE)) {
                personFromQueue = personQueue.poll();
                System.out.println(zosia.getName() + " "
                        + personFromQueue.getName());
            } else {
                personQueue.push(zosia);
            }
        }

        Person marek = new Person("Marek", Sex.MALE);

        if (personQueue.isEmpty()) {
            personQueue.push(marek);
        } else {
            Person personFromQueue = personQueue.peek();
            if (personFromQueue.getSex().equals(Sex.FEMALE)) {
                personFromQueue = personQueue.poll();
                System.out.println(marek.getName() + " "
                        + personFromQueue.getName());
            } else {
                personQueue.push(marek);
            }
        }

    }
}
