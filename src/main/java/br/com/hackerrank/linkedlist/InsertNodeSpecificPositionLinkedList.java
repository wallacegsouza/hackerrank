package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class InsertNodeSpecificPositionLinkedList {
    
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
        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, 1, 6);
        printSinglyLinkedList(llist_head, "\n", bufferedWriter);
    }
}
