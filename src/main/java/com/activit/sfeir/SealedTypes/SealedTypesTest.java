package com.activit.sfeir.SealedTypes;

import org.junit.jupiter.api.Test;

public class SealedTypesTest {

    @Test
    public void sealedInterface() {
        Vehicle car1 = new Car();
        Vehicle bus1 = new Bus();

        System.out.println(maxSpeed(car1));
        System.out.println(maxSpeed(bus1));
    }

    // By doing it this way, we have all our algorithms in the same place instead of having an implemented method in each record.
    // Moreover, we can use types created by someone else and add operations to them.
    int maxSpeed(Vehicle vehicle) {
        return switch (vehicle) {
            case Bus ignored -> 90;
            case Car ignored -> 130;
        };
    }
}
