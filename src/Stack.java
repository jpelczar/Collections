public interface Stack<T> {

    //Add element to stack
    void push(T element);

    //Get and delete from stack
    T pop();

    //Get without delete from stack
    T poll();

    //Is empty collection - true if no elements on stack
    boolean isEmpty();
}
