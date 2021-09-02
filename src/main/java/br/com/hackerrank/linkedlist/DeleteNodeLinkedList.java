package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class DeleteNodeLinkedList {

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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
            if (node != null) {
                System.out.println(sep);
            }
        }
    }

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
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("inserNodeTail.txt"));

        SinglyLinkedList llist = new SinglyLinkedList();

        List<Integer> llistCount = Arrays.asList(141, 302, 164, 530, 474);
        for (Integer i : llistCount) {
            llist.head = insertNode(llist.head, i);
        }
        SinglyLinkedListNode llist_head = deleteNode(llist.head, 3);
        printSinglyLinkedList(llist_head, "\n", bufferedWriter);
    }
}
