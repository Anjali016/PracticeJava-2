package linkedlist;

import org.junit.Test;
import utilities.LinkNode;

import static junit.framework.Assert.assertEquals;

public class LinkedListExampleTest {

    @Test
    public void test1() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

//        assertEquals(1, reverseLinkedList.g(getLinkedList(3), 20).data);
    }

    private LinkNode getLinkedList(int n) {
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


}
