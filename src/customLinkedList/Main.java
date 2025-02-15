package customLinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Element at index 1: " + list.get(1));
        list.remove(1);
        System.out.println("Size after removal: " + list.size());

    }
}
