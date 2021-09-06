package br.com.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class MergeTwoSortedLinkedLists extends BasePracticeLinkedList {
    
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode result = null;

        if (head1 != null && head2 != null) {
            if (head2.data < head1.data) {
                result = new SinglyLinkedListNode(head2.data);
                head2 = head2.next;
            } else {
                result = new SinglyLinkedListNode(head1.data);
                head1 = head1.next;
            }
        } else if (head1 != null) {
            result = new SinglyLinkedListNode(head1.data);
            head1 = head1.next;
        } else if (head2 != null) {
            result = new SinglyLinkedListNode(head2.data);
            head2 = head2.next;
        }

        SinglyLinkedListNode current = result;

        while (head1 != null || head2 != null) {
            if (head1 != null && head2 != null) {
                if (head2.data < head1.data) {
                    current.next = new SinglyLinkedListNode(head2.data);
                    head2 = head2.next;
                } else {
                    current.next = new SinglyLinkedListNode(head1.data);
                    head1 = head1.next;
                }
            } else if (head1 != null) {
                current.next = new SinglyLinkedListNode(head1.data);
                head1 = head1.next;
            } else if (head2 != null) {
                current.next = new SinglyLinkedListNode(head2.data);
                head2 = head2.next;
            }
            current = current.next;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList list1 =  createLinkedlist(Arrays.asList(141, 302, 164, 530, 474));
        SinglyLinkedList list2 =  createLinkedlist(Arrays.asList(1, 2, 3, 141, 301));

        printSinglyLinkedList(mergeLists(list1.head, list2.head), "\n");
    }
    
    static SinglyLinkedList createLinkedlist(List<Integer> list) {
        SinglyLinkedList result = new SinglyLinkedList();
        for (Integer i : list) {
            result.head = insertNode(result.head, i);
        }
        return result;
    }
}
