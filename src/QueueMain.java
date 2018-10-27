public class QueueMain {

    public static void main(String[] args) {
        Queue queue = new ArrayQueue();

        queue.push(78);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        //78
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("IsEmpty: " + queue.isEmpty());
        System.out.println("***************************");

        //1
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("IsEmpty: " + queue.isEmpty());
        System.out.println("***************************");

        //2
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("IsEmpty: " + queue.isEmpty());
        System.out.println("***************************");

        //3
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("IsEmpty: " + queue.isEmpty());
        System.out.println("***************************");

        //4
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("IsEmpty: " + queue.isEmpty());
        System.out.println("***************************");

        //5
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("IsEmpty: " + queue.isEmpty());
        System.out.println("***************************");
    }

}
