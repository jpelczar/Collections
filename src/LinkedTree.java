public class LinkedTree<E extends Comparable<E>> implements Tree<E> {

    private Element<E> root;

    @Override
    public void add(E e) {
        Element<E> newElement = new Element<>(e);
        if (root == null) {
            root = newElement;
            return;
        }
        addElement(root, newElement);
    }

    @Override
    public void printInOrder() {
        if (root == null) {
            return;
        }
        inOrder(root);
    }

    private void inOrder(Element<E> element) {
        if (element.left != null) {
            inOrder(element.left);
        }
        System.out.print(element.toString() + "#");
        if (element.right != null) {
            inOrder(element.right);
        }
    }

    private void addElement(Element<E> parent, Element<E> newElement) {
        if (parent.value.compareTo(newElement.value) > 0) {
            if (parent.left != null) {
                addElement(parent.left, newElement);
            } else {
                parent.left = newElement;
            }
        } else {
            if (parent.right != null) {
                addElement(parent.right, newElement);
            } else {
                parent.right = newElement;
            }
        }
    }

    private static class Element<E> {
        Element<E> left;
        Element<E> right;
        E value;

        private Element(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
