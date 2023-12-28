package org.example;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = List.of(2,1,5,13,14,6,7,7,3,2,6);
        double average = intList.stream()
                .mapToInt(Integer::intValue)
                .filter(x->x%2==0)
                .summaryStatistics().getAverage();
        System.out.println(average);
    }
}