package linkedlist;

import sun.awt.image.ImageWatched;
import utilities.LinkNode;

public class LinkedListExample {


    /*
    * 1.
    * Merge K sorted linked lists
    * Given K sorted linked lists of size N each, merge them and print the sorted output.
    * Example:
    * Input: k = 3, n =  4
    * list1 = 1->3->5->7->NULL
    * list2 = 2->4->6->8->NULL
    * list3 = 0->9->10->11
    *
    * Output:
    * ->1->2->3->4->5->6->7->8->9->10->11
    *
    * Solution : (1) Min Heap (extra Space ((n)log(k))
    * Solution2 : (2)
    * */



    public static void printList(LinkNode head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


    public static LinkNode reverseLinkedList(LinkNode head) {

        if (head == null || head.next == null) return head;
        else {
            LinkNode newHead = reverseLinkedList(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }

    }


    public static LinkNode reverseListIt(LinkNode head) {


        LinkNode curr = head, prev = null, nextNode;

        while (curr != null ) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    private static LinkNode getLinkedList(int n) {
        LinkNode head = null;
        LinkNode tail = null;
        for ( int i = 0; i < n; i++){
            if(head == null) {
                head = new LinkNode(i);
                tail = head;
            }
            else {

                tail.next = new LinkNode(i);
                tail = tail.next;
            }

        }
        return head;
    }

    public static LinkNode removeDuplicates(LinkNode head) {

        LinkNode curr = head, prev;

        while (curr != null && curr.next != null) {
            prev = curr;
            curr = curr.next;
            while (curr != null && prev.data == curr.data) {
                prev.next = curr.next;
                curr.next = null;
                curr = prev.next;
            }
        }

        return head;
    }


    public static void main(String[] args) {

        LinkNode head = new LinkNode(1);
        head.next = new LinkNode(1);
//        head.next.next = new LinkNode(1);
//        head.next.next.next = new LinkNode(2);
//        head.next.next.next.next = new LinkNode(2);
//        head.next.next.next.next.next = new LinkNode(2);

        LinkNode result = removeDuplicates(head);
      //  LinkNode reverseList = reverseListIt(getLinkedList(4));
        printList(result);
    }
}
