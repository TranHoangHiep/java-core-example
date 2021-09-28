package hoanghiep.javacore.datastructure;

public class LinkedList {

    // define node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            data = data;
            next = null;
        }
    }

    // head of the list
    Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;
    }
}
