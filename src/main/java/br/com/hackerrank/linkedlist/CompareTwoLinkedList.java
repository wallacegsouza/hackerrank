package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class CompareTwoLinkedList extends BasePracticeLinkedList {

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (isDifferent(head1, head2)) {
            return false;
        }
        boolean result = true;
        do {
            if (isDifferent(head1, head2)) return false;
            result &= head1.data == head2.data;
            head1 = head1.next;
            head2 = head2.next;
        } while (head1 != null || head2 != null);
        return result;
    }

    static boolean isDifferent(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        return (head1 == null && head2 != null) || (head1 != null && head2 == null);
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList list1 =  createLinkedlist(Arrays.asList(141, 302, 164, 530, 474));
        SinglyLinkedList list2 =  createLinkedlist(Arrays.asList(141));

        System.out.println(compareLists(list1.head, list2.head));
    }
    
    static SinglyLinkedList createLinkedlist(List<Integer> list) {
        SinglyLinkedList result = new SinglyLinkedList();
        for (Integer i : list) {
            result.head = insertNode(result.head, i);
        }
        return result;
    }
}
