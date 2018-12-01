public class TreeMain {
    public static void main(String[] args) {
        Tree<Integer> tree = new LinkedTree<>();
        tree.add(5);
        tree.add(9);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(10);

        tree.printInOrder();
    }
}
