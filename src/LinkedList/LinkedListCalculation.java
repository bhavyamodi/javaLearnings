package LinkedList;
import java.util.LinkedList;
public class LinkedListCalculation {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(0);
        list1.add(4);
        //list1.add(3);
        System.out.println("list 1 : "+list1.toString());

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(0);
        list2.add(6);
        list2.add(4);
        System.out.println("list 2 : "+list2.toString());

        LinkedList sum = addTwoList(list1, list2);
        System.out.println("sum : "+sum.toString());

        LinkedListCalculation obj = new LinkedListCalculation();
        obj.listNodeDefination();

    }

    public static LinkedList addTwoList(LinkedList list1, LinkedList list2){
        LinkedList<Integer> result = new LinkedList<Integer>();
        if(list2.size() < list1.size()){
            return addTwoList(list2, list1);
        }

        int carryForward = 0;
        int index = 0;
        while(index < list1.size()){
            int sum = (int) list1.get(index) + (int) list2.get(index) + carryForward;
            if(sum >= 10){
                carryForward = sum / 10;
                sum %= 10;
            }
            result.add(sum);
            index++;
        }

        while(index < list2.size()){
            result.add((int)list2.get(index) + carryForward);
            index++;
        }
        return result;
    }


    public void listNodeDefination(){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);

        ListNode mergedList = mergeTwoLists(list1, list2);
        printLinkedList(mergedList, "mergeTwoLists");

        ListNode reversedList = reverseLinkedList(mergedList);
        printLinkedList(reversedList,"reverseLinkedList");

        ListNode reversedCustomList = reverseCustomLinkedList(reversedList, 2, 4);
        printLinkedList(reversedCustomList, "reverseCustomLinkedList");

        ListNode reversedAdjacentList = reverseTwoAdjacentNodes(reversedList);
        printLinkedList(reversedAdjacentList, "reverseTwoAdjacentNodes");

        printLinkedList(removeNthNode(reversedList, 5), "removeNthNode");
    }

    public void printLinkedList(ListNode list, String methodName){
        if(list == null){
            System.out.println(methodName+" List is Empty");
        }
        System.out.print(methodName+ " ");
        while(list != null){
            System.out.print(list.val+" ");
            list = list.next;
        }
        System.out.println(" ");
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1);
        ListNode current = result;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return result.next;
    }

    public ListNode reverseLinkedList(ListNode list){
        ListNode result = null;
        ListNode curr = list;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = result;
            result = curr;
            curr = nextTemp;
        }

        return result;
    }

    public ListNode reverseCustomLinkedList(ListNode head, int left, int right){
        ListNode currentNode = head;
        ListNode startNode = null;
        ListNode lastNode = null;
        int i = 1;
        while (currentNode != null) {
            if (i > right) {
                break;
            }
            if (i < left) {
                startNode = currentNode;
            }
            if (i == right) {
                lastNode = currentNode;
            }
            currentNode = currentNode.next;
            i++;
        }
        lastNode.next = null;
        if (left == 1) {
            lastNode = head;
            head = reverseLinkedList(head);
        } else {
            lastNode = startNode.next;
            startNode.next = reverseLinkedList(startNode.next);
        }
        lastNode.next = currentNode;
        return head;
    }

    public ListNode reverseTwoAdjacentNodes(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode remainingList = head.next.next;
        ListNode newHead = head.next;
        newHead.next = head;
        head.next = reverseTwoAdjacentNodes(remainingList);
        return newHead;
    }

    public ListNode removeNthNode(ListNode head, int n){
        ListNode result = head;
        int size = 0;

        while(result != null){
            size++;
            result = result.next;
        }

        if(n == size){
            ListNode newHead = head.next;
            head = null;
            return newHead;
        }

        int index = 0;
        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            if(index == (size - n)){
                if(current.next != null){
                    previous.next = current.next;
                }else{
                    previous.next = null;
                }
            }
            index++;
            previous = current;
            current = current.next;
        }

        System.out.println(size);
        return head;
    }
}
