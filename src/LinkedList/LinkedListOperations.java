package LinkedList;

public class LinkedListOperations extends CustomLinkedList{
    public static void main(String[] args){
        CustomLinkedList list = new CustomLinkedList();
        list = insertAtLast(list, 2);
        //list = insertAtLast(list, 3);
        list = insertAtLast(list, 1);
        list = insertAtLast(list, 1);
        list = insertAtLast(list, 1);

        list = insertAtFirst(list, 1);
        printList(list);
        deleteByValue(list, 1);
        printList(list);
    }

    public static CustomLinkedList deleteByValue(CustomLinkedList list, int value){
        if(list.head == null){
            return list;
        }
        while (list.head != null && list.head.data == value) {
            list.head = list.head.next;
        }

        Node currNode = list.head;
        while(currNode != null && currNode.next != null){
            if(currNode.next.data == value){
                currNode.next = currNode.next.next;
            }else {
                currNode = currNode.next;
            }
        }

        return list;
    }

    public static CustomLinkedList insertAtLast(CustomLinkedList list, int value){
        Node newNode = new Node(value);
        if(list.head == null){
            list.head = newNode;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static CustomLinkedList insertAtFirst(CustomLinkedList list, int value){
        Node newNode = new Node(value);
        if(list.head != null){
            newNode.next = list.head;
        }
        list.head = newNode;
        return list;
    }

    public static void printList(CustomLinkedList list){
        Node currentNode = list.head;
        if(currentNode == null){
            System.out.println("List Is Empty!");
            return;
        }
        System.out.println("Linked List : ");
        while(currentNode != null && currentNode.next != null){
            System.out.print(currentNode.data+ " ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data+ " ");
    }

}
