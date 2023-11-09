package com.activit.sfeir.Records;

public record PlayerRecord(String name, String lastName, String sport, int age, int jerseyNumber) {

    //we can redefine the default constructor to add argument validators.
    public PlayerRecord {
        if (jerseyNumber < 0 || jerseyNumber > 99) {
            throw new IllegalArgumentException("jerseyNumber should be between 0 and 99.");
        }
    }
}