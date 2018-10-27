public class StackMain {

    public static void main(String[] args) {
        Stack<String> stack = new LinkedStack<>();

        for (Integer i = 0; i < 17; i++) {
            System.out.println("Add " + i + " to stack");
            stack.push("A: " + i);
            System.out.println("Poll: " + stack.poll());
        }

        System.out.println("AApre");

        stack.push("A: " + 17);

        System.out.println("AApre");

//        while (true) {
//            System.out.println("Stack value: " + stack.pop());
//        }
    }

}
