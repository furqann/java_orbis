package com.orbis.java;

import java.util.List;

import static java.util.Arrays.asList;

public class IntegerStreams {
    private IntegerStreams(){}

    private static List<Integer> numbers = asList(1,2,34,5,6,7,8,9);

    public static void showNumbers(){
        numbers.forEach(System.out::println);
    }
}
