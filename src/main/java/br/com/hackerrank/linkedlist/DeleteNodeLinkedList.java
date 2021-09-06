package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class DeleteNodeLinkedList extends BasePracticeLinkedList {

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        if (llist == null) {
            return llist;
        }

        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode before = llist;
        if (position == 0) {
            SinglyLinkedListNode result = current.next;
            current.next = null;
            return result;
        }

        int idx = 0;
        for (; idx < position; idx++) {
            if (current.next == null) break;
            before = current;
            current = current.next;
        }
        before.next = current == null? null : current.next;
        return llist;
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        List<Integer> llistCount = Arrays.asList(141, 302, 164, 530, 474);
        for (Integer i : llistCount) {
            llist.head = insertNode(llist.head, i);
        }
        SinglyLinkedListNode llist_head = deleteNode(llist.head, 3);
        printSinglyLinkedList(llist_head, "\n");
    }
}
