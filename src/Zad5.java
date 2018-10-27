public class Zad5 {

    public static void main(String[] args) {

        Queue<Person> personQueue = new ArrayQueue<>();

        queueManager(new Person("Zosia", Sex.FEMALE), personQueue);
        queueManager(new Person("Basia", Sex.FEMALE), personQueue);
        queueManager(new Person("Marek", Sex.MALE), personQueue);
        queueManager(new Person("Krzysztof", Sex.MALE), personQueue);
        queueManager(new Person("Tomek", Sex.MALE), personQueue);
        queueManager(new Person("Marysia", Sex.FEMALE), personQueue);
    }

    private static void queueManager(Person personToAdd,
                                     Queue<Person> personQueue) {
        if (personQueue.isEmpty()) { //Sprawdzamy czy jest ktoś w kolejce do pary
            personQueue.push(personToAdd); //Jeśli nie to idziemy do kolejki
        } else {
            Person personFromQueue = personQueue.peek(); //Podgladamy osobe z kolejki
            if (personFromQueue.getSex() != personToAdd.getSex()) { //Sprawdzamy czy osoba z kolejki jest płci przeciwnej
                personFromQueue = personQueue.poll(); //jeśli tak to ściągamy ją z kolejki i wypisujemy pare
                System.out.println(personFromQueue.getName() + " "
                        + personToAdd.getName());
            } else {
                //jeśli nie to idzimy do kolejki
                personQueue.push(personToAdd);
            }
        }
    }
}
