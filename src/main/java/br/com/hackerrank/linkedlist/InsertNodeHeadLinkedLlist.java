package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class InsertNodeHeadLinkedLlist {

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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
            if (node != null) {
                System.out.println(sep);
            }
        }
    }

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
