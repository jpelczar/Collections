public class ArrayQueue<T> implements Queue<T> {

    T[] holder = (T[]) new Object[15];
    int headIndex = -1;

    @Override
    public void push(T element) {
        headIndex++;
        holder[headIndex] = element;
    }

    @Override
    public T poll() {
        T value = holder[0];

        //Usuwanie elementu
        for (int i = 1; i < holder.length; i++) {
            holder[i - 1] = holder[i];
        }

        headIndex--;
        //Koniec usuwania elementu

        return value;
    }

    @Override
    public T peek() {
        return holder[0];
    }

    @Override
    public boolean isEmpty() {
        return headIndex < 0;
    }
}
