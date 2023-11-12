package com.activit.sfeir.MeaningFulNPE;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MeaningFulNpeTest {

    @Test
    public void meaningFulNPE() {
        record Person(String name) {
        }

        Person person1 = new Person(null);

        NullPointerException myNpe1 = assertThrows(NullPointerException.class,
                () -> person1.name().toLowerCase());

        Person person2 = null;
        NullPointerException myNpe2 = assertThrows(NullPointerException.class,
                () -> person2.name().toLowerCase());

        //NPE message is : "Cannot invoke "String.toLowerCase()" because the return value of "com.activit.sfeir.MeaningFulNPE.MeaningFulNpeTest$1Person.name()" is null"
        System.out.println(myNpe1.getMessage());

        //NPE message is : "Cannot invoke "com.activit.sfeir.MeaningFulNPE.MeaningFulNpeTest$1Person.name()" because "person2" is null"
        System.out.println(myNpe2.getMessage());
    }
}
