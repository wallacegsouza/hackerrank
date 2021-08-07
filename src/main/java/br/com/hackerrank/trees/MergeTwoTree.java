package br.com.hackerrank.trees;

import java.util.Set;
import java.util.TreeSet;

public class MergeTwoTree {

    public static Node merge(Node menuPai, Node menu1, Node menu2) {
        if (menu1 == null && menu2 == null)
            return menuPai;

        if (menu1 == null) {
            menuPai.childres.add(menu2);
            return menuPai;
        }
        if (menu2 == null) {
            menuPai.childres.add(menu1);
            return menuPai;
        }

        if (menu1.id.equals(menu2.id)) {
            Node newNode = new Node(menu1.id);
            newNode.childres.addAll(menu1.childres);
            for (Node n2: menu2.childres) {
                if (newNode.childres.contains(n2)) {
                    Node n1 = newNode.childres.stream()
                        .filter(x -> x.id.equals(n2.id))
                        .findFirst().get();
                    merge(newNode, n1, n2);
                } else {
                    newNode.childres.add(n2);   
                }
            }
            menuPai.childres.add(newNode);
        } else {
            menuPai.childres.add(menu1);
            menuPai.childres.add(menu2);
        }
        return menuPai;
    }

    public static void main(String[] args) {
        Node result = merge(null, null, null);
        System.out.println(result == null);

        result = merge(new Node(1d, null), null, null);
        System.out.println(result.id == 1d);

        result = merge(new Node(1d), new Node(2d, null), null);
        System.out.println(result.id == 1d);
        System.out.println(result.childres.toArray(new Node[1])[0].id == 2d);

        result = merge(new Node(1d), new Node(2d, null), new Node(3d, null));
        System.out.println(result.id == 1d);
        System.out.println(result.childres.toArray(new Node[2])[0].id == 2d);
        System.out.println(result.childres.toArray(new Node[2])[1].id == 3d);

        result = merge(new Node(1d), new Node(2d, null), new Node(2d, null));
        System.out.println(result.id == 1d);
        System.out.println(result.childres.toArray(new Node[1])[0].id == 2d);
        System.out.println(result.childres.size() == 1);

        Set<Node> childSet = new TreeSet<>();
        childSet.add(new Node(3d));
        childSet.add(new Node(4d));

        result = merge(new Node(1d), new Node(2d, childSet), new Node(2d, null));
        System.out.println(result.id == 1d);
        System.out.println(result.childres.toArray(new Node[1])[0].id == 2d);
        System.out.println(result.childres.size() == 1);
        System.out.println(result.childres.toArray(new Node[1])[0].childres.size() == 2);

        Set<Node> childSet2 = new TreeSet<>();
        childSet2.add(new Node(3d));
        childSet2.add(new Node(4d));

        Set<Node> childSet3 = new TreeSet<>();
        childSet3.add(new Node(5d));
        childSet3.add(new Node(6d));

        result = merge(new Node(1d), new Node(2d, childSet2), new Node(2d, childSet3));
        System.out.println(result.id == 1d);
        System.out.println(result.childres.toArray(new Node[1])[0].id == 2d);
        System.out.println(result.childres.size() == 1);
        System.out.println(result.childres.toArray(new Node[1])[0].childres.size() == 4);

    }
}

class Node implements Comparable<Node> {
    Double id = Math.random();
    Set<Node> childres = new TreeSet<>();
    public Node(Double id, Set<Node> childres) {
        this.id = id;
        if (childres != null) {
            this.childres = childres;
        }
    }
    public Node() {}
    public Node(Double id) { this.id = id; }
    @Override public int compareTo(Node o) {
        return this.id.compareTo(o.id);
    }
}
