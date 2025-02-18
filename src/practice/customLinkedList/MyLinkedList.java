package practice.customLinkedList;

public class MyLinkedList<T> {
    private static class Node<T> {

        T data;
        Node<T> nextNode;

        Node(T data) {
            this.data = data;
            this.nextNode = null;
        }

    }

    private Node<T> firstNode;
    private int size;

    public MyLinkedList() {
        this.firstNode = null;
        this.size = 0;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            Node<T> currentNode = firstNode;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.nextNode;
        }
        return currentNode.data;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            firstNode = firstNode.nextNode;
        } else {
            Node<T> currentNode = firstNode;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = currentNode.nextNode.nextNode;
        }
        size--;
    }

    public int size() {
        return size;
    }
}
