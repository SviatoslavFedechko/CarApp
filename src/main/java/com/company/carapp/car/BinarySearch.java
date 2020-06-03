package com.company.carapp.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class BinarySearch {

    static List<Integer> monets = Arrays.asList(5, 25, 10, 50).stream().sorted().collect(Collectors.toList());
    static TreeMap<Integer, Integer> monetQuant = new TreeMap<>();

    public static void main(String[] args) {
        int y = 65;
        getMonetQuant(y, monets.size() - 1);

        TreeSet treeSet=new TreeSet();
        treeSet.add(null);
        System.out.println(treeSet);

        List<Integer> number = Arrays.asList(2,3,4,5);
        int even = number.stream().filter(x-> x % 2 == 0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);

        monetQuant.entrySet().stream()
            .filter(e -> e.getValue() != 0)
            .forEach(System.out::println);
    }


    public static TreeMap<Integer, Integer> getMonetQuant(int remainder, int index) {

        monetQuant.put(monets.get(index), remainder / monets.get(index));

        remainder %= monets.get(index);
        if (remainder == 0) {
            return monetQuant;
        }

        return getMonetQuant(remainder, index - 1) ;
    }

    private static int[] findIndex(int[] test) {
        for (int i = 1; i < test.length; i++) {
            int key = test[i];
            int j = i - 1;
            while (j >= 0 && test[j] > key) {
                test[j + 1] = test[j];
                j--;
            }
            test[j + 1] = key;
        }
        return test;

    }

    private static String revertString(String test) {
        if (test.length() == 0) {
            return "";
        }
        return revertString(test.substring(1)) + test.charAt(0);
    }

    public static void fg(String[] args) {
        int[] test = {10, 3, 9, 2, 5, 7, 6, 8, 4, 1};
        int[] index = findIndex(test);
        for (int i = 0; i < index.length; i++) {
            //            System.out.print(index[i] + ",");
        }
        List<Integer> list2 = Arrays.asList(5, 6, 2);
        int res = list2.parallelStream().reduce(1, (s1, s2) -> s1 + s2, (p, q) -> p * q);
        System.out.println(res);

    }

    private static List<Integer> revertList(List<Integer> profit) {
        if (profit.size() <= 1) {
            return profit;
        }
        List<Integer> reversed = new ArrayList<>();
        reversed.add(profit.get(profit.size() - 1));
        reversed.addAll(revertList(profit.subList(0, profit.size() - 1)));

        return reversed;
    }
}
