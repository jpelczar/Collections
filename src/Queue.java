public interface Queue {

    //Dodanie elementu
    void push(int element);

    //Pobranie wartości i usunięcie
    int poll();

    //Pobranie bez usunięcia
    int peek();

    //Sprawdzenie czy jest pusta
    boolean isEmpty();
}
