package com.activit.sfeir.ListFeatures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListFeaturesTest {

    @Test
    public void listFeaturesTest() {
        //Creates a mutable list
        List<String> numbers = new ArrayList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");

        //Java 9 new features : List.of(), creates an immutable list
        List<String> numbers2 = List.of("one", "two", "three");

        //Java 9 new features : List.copyOf(), creates an immutable list
        //Copy of creates a copy of the list passed as a parameter
        List<String> copyNumbers = List.copyOf(numbers);
        //copyOf on an immutable list, create a reference to the same object
        List<String> copyNumbers2 = List.copyOf(numbers2);

        Assertions.assertNotSame(numbers, copyNumbers); // numbers != copyNumbers
        Assertions.assertSame(numbers2, copyNumbers2); // numbers2 == copyNumbers2
    }
}
