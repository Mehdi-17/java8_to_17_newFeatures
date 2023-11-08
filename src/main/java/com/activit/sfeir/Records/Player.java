package com.activit.sfeir.Records;

import java.util.Objects;

public class Player {
    private final String name;
    private final String lastName;
    private final String sport;
    private final int age;
    private final int jerseyNumber;

    public Player(String name, String lastName, String sport, int age, int jerseyNumber) {
        this.name = name;
        this.lastName = lastName;
        this.sport = sport;
        this.age = age;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSport() {
        return sport;
    }

    public int getAge() {
        return age;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return age == player.age && jerseyNumber == player.jerseyNumber && Objects.equals(name, player.name) && Objects.equals(lastName, player.lastName) && Objects.equals(sport, player.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, sport, age, jerseyNumber);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sport='" + sport + '\'' +
                ", age=" + age +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }
}
