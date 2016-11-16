package linkedlist;

import utilities.LinkNode;

public class NthNode {

    public  LinkNode getNthNode(LinkNode head, int n) {

        if (head == null || n == 1)
            return head;
        else
            return getNthNode(head.next, n - 1);
    }
}
