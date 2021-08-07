package br.com.hackerrank.arrays;

public class QueueExample {
    public static void main(String[] args) {
        java.util.Queue<Integer> q = new java.util.LinkedList<>();
        for (int i = 0; i < 5; i++) q.add(i);
        System.out.println("Elements of queue " + q);
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);
        System.out.println(q);
        int head = q.peek();
        System.out.println("head of queue-" + head);
        int size = q.size();
        System.out.println("Size of queue- " + size);
    }
}
