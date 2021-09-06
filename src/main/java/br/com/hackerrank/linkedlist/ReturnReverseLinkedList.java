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
        @Override
        public String toString() {
            return data + " -> " + next != null ? next.toString() : " null";
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
            if (node != null) {
                System.out.println(sep);
            }
        }
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        if (llist == null || llist.next == null) return llist;

        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode before = null;
        SinglyLinkedListNode after = current;
        while (current != null) {
            after = current.next;
            current.next = before;
            before = current;
            current = after;
        }
        return before;
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
        SinglyLinkedListNode llist_head = reverse(llist.head);
        printSinglyLinkedList(llist_head, "\n");
    }
}
