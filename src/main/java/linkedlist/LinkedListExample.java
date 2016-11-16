package linkedlist;

import sun.awt.image.ImageWatched;
import utilities.LinkNode;

public class LinkedListExample {

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
