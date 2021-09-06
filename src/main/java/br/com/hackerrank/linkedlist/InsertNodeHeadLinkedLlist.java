package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class InsertNodeHeadLinkedLlist extends BasePracticeLinkedList {

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        if (llist == null) {
            return new SinglyLinkedListNode(data);
        }
        SinglyLinkedListNode tail = new SinglyLinkedListNode(data);;
        tail.next = llist;
        return tail;
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        List<Integer> llistCount = Arrays.asList(141, 302, 164, 530, 474);
        for (Integer i : llistCount) {
            llist.head = insertNodeAtHead(llist.head, i);
        }

        printSinglyLinkedList(llist.head, "\n");
    }
}
