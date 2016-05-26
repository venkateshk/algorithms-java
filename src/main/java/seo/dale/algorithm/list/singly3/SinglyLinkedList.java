package seo.dale.algorithm.list.singly3;

/**
 * http://www.java2novice.com/data-structures-in-java/linked-list/singly-linked-list/
 */
public class SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(T data) {
        Node<T> node = new Node<>(data);
        System.out.println("Adding " + data);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
    }

    public void addAfter(T data, T afterData) {
        System.out.println("Adding " + data + " after " + afterData);

        Node<T> current = head;
        while (current != null) {
            if (current.getData() == afterData) {
                break;
            }
            current = current.getNext();
        }

        if (current != null) {
            Node<T> node = new Node<>(data);
            node.setNext(current.getNext());
            current.setNext(node);
            if (current == tail) {
                tail = node;
            }
        } else {
            System.out.println("Unable to find the given element...");
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            builder.append(current.getData());
            builder.append("->");
            current = current.getNext();
        }
        if (builder.length() > 2) {
            builder.setLength(builder.length() - 2);
        }
        return builder.toString();
    }


}

class Node<T> implements Comparable<T> {

    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public T getData() {
        return value;
    }

    public void setData(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> nextRef) {
        this.next = nextRef;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

}
