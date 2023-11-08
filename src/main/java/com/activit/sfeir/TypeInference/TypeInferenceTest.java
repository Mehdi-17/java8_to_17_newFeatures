package com.activit.sfeir.TypeInference;

import org.junit.jupiter.api.Test;

public class TypeInferenceTest {

    @Test
    public void typeInferenceTest() {
        //classic
        String name = "Mehdi";
        //new type inference syntax
        var lastName = "Serra";
        System.out.printf("%s %s\n", name, lastName);

        //With more complex type
        Person person1 = new Person("Mehdi", "Serra", 27);
        var person2 = new Person("Cristiano", "Ronaldo", 38);

        System.out.println(person1);
        System.out.println(person2);
    }

}

record Person(String name, String lastName, int age) {
}
