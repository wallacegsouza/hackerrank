package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class InsertNodeTailLinkedList extends BasePracticeLinkedList {

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null) {
            return new SinglyLinkedListNode(data);
        }

        SinglyLinkedListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new SinglyLinkedListNode(data);

        return head;
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        List<Integer> llistCount = Arrays.asList(141, 302, 164, 530, 474);
        for (Integer i : llistCount) {
            llist.head = insertNodeAtTail(llist.head, i);
        }

        printSinglyLinkedList(llist.head, "\n");
    }
}
