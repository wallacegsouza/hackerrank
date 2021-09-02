package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class InsertNodeTailLinkedList {

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
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("inserNodeTail.txt"));

        SinglyLinkedList llist = new SinglyLinkedList();

        List<Integer> llistCount = Arrays.asList(141, 302, 164, 530, 474);
        for (Integer i : llistCount) {
            llist.head = insertNodeAtTail(llist.head, i);
        }

        printSinglyLinkedList(llist.head, "\n", bufferedWriter);
    }
}
