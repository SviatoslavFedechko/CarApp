package com.company.carapp.car;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestApp {




    public static void main(String[] args) throws IOException {
        List<Integer> profit = Arrays.asList(-2, 5, 3, -1, -8, 7, 6, 1);
//        System.out.println(calculateMaxSegmentsValue(4, profit));
//        System.out.println(findSmallestDivision("bcdbcdbcd", "bcdbcd"));
    }

    private static int findSmallestDivision(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return -1;
        }
        if (canFirstBeConcatenatedToObtainSecond(s, t)) {
            return smallestConcatStringForBoth(s, t);
        }
        return -1;
    }

    private static int smallestConcatStringForBoth(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            String stringPartToCheck = t.substring(0, i + 1);
            if (canFirstBeConcatenatedToObtainSecond(t, stringPartToCheck) &&
                canFirstBeConcatenatedToObtainSecond(s, stringPartToCheck)) {
                return stringPartToCheck.length();
            }
        }
        return -1;
    }

    private static boolean canFirstBeConcatenatedToObtainSecond(String s, String t) {
        if (!isSDevidebleByT(s, t)) {
            return false;
        }

        int concatQuantity = s.length()/t.length();
        String repeatedT = new String(new char[concatQuantity]).replace("\0", t);
        return s.equals(repeatedT);
    }

    private static boolean isSDevidebleByT(String s, String t) {
        return s.length() % t.length() == 0;
    }

    //    static long rotLeft(int k, List<Integer> profit) {
//        int n = profit.size();
//        if (n == 2) {
//            return profit.stream().mapToLong(f -> f.longValue()).sum();
//        }
//        List<Long> segmentsProf = new ArrayList<>();
//        for (int i = 0; i < n/2 - 1; i++) {
//
//            long segmentsSum = 0L;
//            int j;
//            for (j = i; j < i + k; j++) {
//                int endIndex = i + k;
//                if (j < endIndex) {
//                    segmentsSum = segmentsSum + profit.get(j);
//                    System.out.println("j 1 = " + j );
//                }
//            }
//            int first = n/2 + i;
//            int last = first + k;
//            if (last > n - 1) {
//                for (j = first; j < n; j++) {
//                    segmentsSum = segmentsSum + profit.get(j);
//                    System.out.println("j 2 = " + j );
//                }
//                for (int l = 0; l < last - n-1; l++) {
//                    segmentsSum = segmentsSum + profit.get(l);
//                    System.out.println("l 1 = " + l );
//                }
//            } else {
//                for (j = first; j < last; j++) {
//                    segmentsSum = segmentsSum + profit.get(j);
//                    System.out.println("j 2 = " + j );
//                }
//            }
//
//            System.out.println("segmentsSum = " + segmentsSum );
//            segmentsProf.add(segmentsSum);
//        }
//        return segmentsProf.stream().max(Long::compareTo).orElse(0l);
//    }

//
//    class Result {
//
//        public static List<String> sortDates(List<String> dates) {
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
//            List<String> sortedDates = dates.stream()
//                .map(date -> LocalDate.parse(date, formatter))
//                .sorted()
//                .map(date -> date.format(formatter))
//                .collect(Collectors.toList());
//            return sortedDates;
////
//        }
//
//    }
    //public static int calculateMaxSegmentsValue(int blocksCount, List<Integer> segments) {
    //        int max = 0;
    //        int segmentsLength = segments.size();
    //        int offset = segmentsLength / 2;
    //        for (int step = 0; step < offset; step++) {
    //            int sum = 0;
    //            for (int i = step; i < blocksCount + step; i++) {
    //                sum = sum + segments.get(i);
    //                sum = sum + segments.get(calculateOpositeIndex(segmentsLength, i, offset));
    //            }
    //            if (sum > max) {
    //                max = sum;
    //            }
    //        }
    //        return max;
    //    }
    //
    //    private static int calculateOpositeIndex(int segmentsLength, int currentPosition, int offset) {
    //        int opositeIndex = currentPosition + offset;
    //        if (opositeIndex >= segmentsLength) {
    //            return  opositeIndex - segmentsLength;
    //        } else {
    //            return opositeIndex;
    //        }
    //    }

}
