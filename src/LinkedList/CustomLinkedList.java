package LinkedList;

public class CustomLinkedList {
    Node head;

    protected void linkedListToString() {
        String retStr = "Contents:\n";

        Node current = head;
        while(current != null){
            retStr += current.data + "\n";
            current = current.next;
        }
        System.out.print(retStr);

    }

    static class Node {
        int data;
        Node next;
        Node(int value) {
            data = value;
        }
    }

}
