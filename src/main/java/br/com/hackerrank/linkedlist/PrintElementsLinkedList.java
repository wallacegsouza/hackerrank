package br.com.hackerrank.linkedlist;

import java.util.*;

public class PrintElementsLinkedList {

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
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        if (head == null)
            System.exit(0);

        SinglyLinkedListNode current = head;
        System.out.println(head.data);
        while (current.next != null) {
            current = current.next;
            System.out.println(current.data);
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        List<Integer> llistCount = Arrays.asList(16, 13);
        for (Integer i : llistCount) {   
            llist.insertNode(i);
        }

        printLinkedList(llist.head);
    }
}
