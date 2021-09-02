package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class ReturnReverseLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        if (llist == null) return null;

        List<Integer> result = new ArrayList<Integer>();
        SinglyLinkedListNode current = llist;
        while (current != null) {
            result.add(current.data);
            current = current.next;
        }
        Collections.reverse(result);
        for (Integer i: result) {
            System.out.println(i);
        }
    }

    static SinglyLinkedListNode insertNode(SinglyLinkedListNode head, int data) {
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
            llist.head = insertNode(llist.head, i);
        }
        reversePrint(llist.head);
    }
}
