package br.com.hackerrank.stacks;

import java.util.*;

import com.google.common.base.Stopwatch;

public class MaximumElement {
    
    // 1 x  -Push the element x into the stack.
    // 2    -Delete the element present at the top of the stack.
    // 3    -Print the maximum element in the stack.
    public static List<Integer> result(List<String> operations) {
        if (operations == null || operations.isEmpty())
            System.exit(0);

        List<Integer> stack = new ArrayList<>();
        List<Integer> array = new ArrayList<>(operations.size());
        List<Integer> sorterd = new ArrayList<>(operations.size());
        for (String query : operations) {
            char command = query.charAt(0);
            switch (command) {
                case '1':
                    Integer val = Integer.valueOf(query.substring(2));
                    stack.add(val);
                    sorterd.add(val);
                    Collections.sort(sorterd);
                    break;
                case '2':
                    if (stack.size() < 0) System.exit(0);
                    Integer top = stack.get(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    sorterd.remove(top);
                    break;
                case '3':
                    Integer max = sorterd.get(sorterd.size() -1);
                    array.add(max);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
        return array;
    }

    public static List<Integer> result2(List<String> operations) {
        if (operations == null || operations.isEmpty())
            System.exit(0);

        List<Integer> stack = new ArrayList<>();
        List<Integer> array = new ArrayList<>(operations.size());
        Map<Integer, Integer> statistic = new TreeMap<>();
        for (String query : operations) {
            char command = query.charAt(0);
            switch (command) {
                case '1':
                    Integer val = Integer.valueOf(query.substring(2));
                    stack.add(val);
                    if (statistic.containsKey(val)) {
                        statistic.put(val, statistic.get(val) + 1);
                    } else {
                        statistic.put(val, 0);
                    }
                    break;
                case '2':
                    if (stack.size() < 0) System.exit(0);
                    Integer top = stack.get(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    if (statistic.get(top) > 0) {
                        statistic.put(top, statistic.get(top) - 1);
                    } else {
                        statistic.remove(top);
                    }
                    break;
                case '3':
                    Integer max = statistic.keySet().stream()
                        .skip(statistic.size() - 1)
                        .findFirst().get();
                    array.add(max);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
        return array;
    }

    public static List<Integer> result3(List<String> operations) {
        if (operations == null || operations.isEmpty())
            System.exit(0);

        List<int[]> stack = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Integer max = Integer.MIN_VALUE;
        for (String query : operations) {
            char command = query.charAt(0);
            switch (command) {
                case '1':
                    Integer val = Integer.valueOf(query.substring(2));
                    max = Math.max(max, val);
                    stack.add(new int[] { val, max });
                    break;
                case '2':
                    if (!stack.isEmpty())
                        stack.remove(stack.size() - 1);
                    if (stack.isEmpty()) {
                        max = Integer.MIN_VALUE;
                    } else {
                        max = stack.get(stack.size() - 1)[1];
                    }
                    break;
                case '3':
                    if (!stack.isEmpty())
                        result.add(stack.get(stack.size() - 1)[1]);
                    break;
                default:
                    System.exit(0);
                    break;
                
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Stopwatch watch = Stopwatch.createStarted();
        for (int i = 0; i < 1000; i++) {
            execution();
        }
        watch.stop();
        System.out.println("time " + watch);
    }

    private static void execution() {
        List<String> parr = Arrays.asList(
            "1 97", "2", "1 20", "2", "1 26",
            "1 20", "2", "3", "1 91", "3");
        List<Integer> aux = result3(parr);
        System.out.println("teste 1");
        System.out.println(aux.get(0) == 26);
        System.out.println(aux.get(1) == 91);

        parr = Arrays.asList(
            "1 1", "1 44", "3", "3", "2", "3", "3", "1 3", "1 37",
            "2", "3", "1 29", "3", "1 73", "1 51", "3", "3", "3", 
            "1 70", "3", "1 8", "2", "1 49", "1 56", "1 81", "2", 
            "1 59", "1 44", "2", "3", "3", "2", "3", "3", "1 4",
            "3", "1 89", "2", "1 37", "1 50", "1 64", "2", "1 49", 
            "1 35", "1 85", "3", "1 41", "2", "3", "3", "1 86", 
            "3", "1 60", "1 8", "3", "1 100", "3", "1 83", "3", 
            "1 47", "2", "1 78", "2", "1 55", "1 97", "2", "3", 
            "1 40");

        aux = result3(parr);

        List<Integer> expect = Arrays.asList(
            44, 44, 1, 1, 3, 29, 
            73, 73, 73, 73, 73, 
            73, 73, 73, 73, 85, 
            85, 85, 86, 86, 100, 
            100, 100);

        System.out.println("teste 2");
        System.out.println("expect.size = " + expect.size());
        System.out.println("aux.size = " + aux.size());
        System.out.println(expect.size() == aux.size());

        for (int i = 0; i < expect.size(); i++) {
            System.out.print(expect.get(i) + " == " + aux.get(i) + " ? ");
            System.out.println(expect.get(i) == aux.get(i));
        }


        System.out.println("teste 3");
        parr = Arrays.asList("1 1", "1 44", "3", "3", "2", "3", "3", "1 3", "1 37",
            "2", "3", "1 29", "3", "1 73", "1 51", "3", "3", "3", "1 70", "3",
            "1 8", "2", "1 49", "1 56", "1 81", "2", "1 59", "1 44", "2", "3",
            "3", "2", "3", "3", "1 4", "3", "1 89", "2", "1 37", "1 50", "1 64",
            "2", "1 49", "1 35", "1 85", "3", "1 41", "2", "3", "3", "1 86", "3", 
            "1 60", "1 8", "3", "1 100", "3", "1 83", "3", "1 47", "2", "1 78",
            "2", "1 55", "1 97", "2", "3", "1 40");
    
        aux = result3(parr); 
        expect = Arrays.asList(
            44, 44, 1, 1, 3, 29, 73, 73,
            73, 73, 73, 73, 73, 73, 73,
            85, 85, 85, 86, 86, 100, 100, 100);

        for (int i = 0; i < expect.size(); i++) {
            System.out.print(expect.get(i) + " == " + aux.get(i) + " ? ");
            System.out.println(expect.get(i) == aux.get(i));            
        }
    }    
}
