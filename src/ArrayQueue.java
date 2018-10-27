public class ArrayQueue implements Queue {

    int[] holder = new int[15];
    int headIndex = -1;

    @Override
    public void push(int element) {
        headIndex++;
        holder[headIndex] = element;
    }

    @Override
    public int poll() {
        int value = holder[0];

        //Usuwanie elementu
        for (int i = 1; i < holder.length; i++) {
            holder[i - 1] = holder[i];
        }

        headIndex--;
        //Koniec usuwania elementu

        return value;
    }

    @Override
    public int peek() {
        return holder[0];
    }

    @Override
    public boolean isEmpty() {
        return headIndex < 0;
    }
}
