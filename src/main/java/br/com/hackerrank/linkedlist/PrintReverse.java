package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class PrintReverse extends BasePracticeLinkedList {

    // TODO refazer
    public static void reversePrint(SinglyLinkedListNode llist) {
        if (llist == null) return;

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

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        List<Integer> llistCount = Arrays.asList(141, 302, 164, 530, 474);
        for (Integer i : llistCount) {
            llist.head = insertNode(llist.head, i);
        }
        reversePrint(llist.head);
    }
}
