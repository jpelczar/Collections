public interface Queue<T> {

    //Dodanie elementu
    void push(T element);

    //Pobranie wartości i usunięcie
    T poll();

    //Pobranie bez usunięcia
    T peek();

    //Sprawdzenie czy jest pusta
    boolean isEmpty();
}
