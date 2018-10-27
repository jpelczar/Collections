import java.util.Arrays;

//ver 1 - no more than 15 elements on stack
//ver 2 - unlimited elements on stack
//ver 3 - added generics
public class ArrayStack<T> implements Stack<T> {

    private final T DEFAULT_EMPTY_VALUE = null;

    private T[] stackArrayHolder = (T[]) new Object[15];
    private int currentIndex = -1;

    @Override
    public void push(T element) {
        currentIndex++;

        if (currentIndex >= stackArrayHolder.length) {

            int newSize = stackArrayHolder.length * 2;
            //TODO check if newSize is not greater than MAX_INT

            stackArrayHolder = Arrays.copyOf(stackArrayHolder, newSize);
        }

        stackArrayHolder[currentIndex] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return DEFAULT_EMPTY_VALUE;
        }
        T currentValue = stackArrayHolder[currentIndex];
        currentIndex--;
        return currentValue;
    }

    @Override
    public T poll() {
        return stackArrayHolder[currentIndex];
    }

    @Override
    public boolean isEmpty() {
        return currentIndex < 0;
    }
}
