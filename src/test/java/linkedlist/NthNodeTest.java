package linkedlist;

import org.junit.Test;
import sun.awt.image.ImageWatched;
import utilities.LinkNode;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.format;

public class NthNodeTest {


   @Test
    public void test1() {

       NthNode nthNode = new NthNode();
       assertEquals(1, nthNode.getNthNode(getLinkedList(3), 20).data);
   }

    private LinkNode  getLinkedList(int n) {
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
