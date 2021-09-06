package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class InsertNodeSpecificPositionLinkedList extends BasePracticeLinkedList {

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        if (llist == null) {
            return new SinglyLinkedListNode(data);
        }

        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode before = llist;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (position == 0) {
            newNode.next = current;
            return newNode;
        }

        int idx = 0;
        for (; idx < position; idx++) {
            if (current == null) break;
            before = current;
            current = current.next;
        }
        
        newNode.next = current;
        before.next = newNode;
        return llist;
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        List<Integer> llistCount = Arrays.asList(141, 302, 164, 530, 474);
        for (Integer i : llistCount) {
            llist.head = insertNode(llist.head, i);
        }
        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, 1, 6);
        printSinglyLinkedList(llist_head, "\n");
    }
}
