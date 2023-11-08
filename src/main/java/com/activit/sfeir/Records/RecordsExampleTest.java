package com.activit.sfeir.Records;

import org.junit.jupiter.api.Test;

public class RecordsExampleTest {

    @Test
    public void recordsExample() {
        Player cristianoRonaldo = new Player("Cristiano", "Ronaldo", "Football", 38, 7);
        PlayerRecord julioJones = new PlayerRecord("Julio", "Jones", "American Football", 34, 11);

        System.out.println(cristianoRonaldo);
        System.out.println(cristianoRonaldo.getName());
        System.out.println(cristianoRonaldo.getLastName());
        System.out.println(cristianoRonaldo.getAge());
        System.out.println(cristianoRonaldo.getSport());
        System.out.println(cristianoRonaldo.getJerseyNumber());

        System.out.println(julioJones);
        System.out.println(julioJones.name());
        System.out.println(julioJones.lastName());
        System.out.println(julioJones.age());
        System.out.println(julioJones.sport());
        System.out.println(julioJones.jerseyNumber());
    }
}
