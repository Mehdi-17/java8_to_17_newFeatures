package com.activit.sfeir.Instanceof;

import org.junit.jupiter.api.Test;

public class InstanceOfUseTest {

    @Test
    public void instanceOfTest() {
        AbstractPlayer basketballPlayer = new BasketballPlayer();
        AbstractPlayer footballPlayer = new FootballPlayer();

        useOldInstanceOf(footballPlayer);
        useNewInstanceOf(basketballPlayer);
        System.out.println(instanceOfWithCheck("Mehdi"));
        System.out.println(instanceOfWithCheck("Jean"));
    }

    private void useOldInstanceOf(AbstractPlayer player) {
        if (player instanceof BasketballPlayer) {
            ((BasketballPlayer) player).throwBall();
        } else if (player instanceof FootballPlayer) {
            ((FootballPlayer) player).shootBall();
        }
    }

    private void useNewInstanceOf(AbstractPlayer player) {
        if (player instanceof BasketballPlayer basketballPlayer) {
            basketballPlayer.throwBall();
        } else if (player instanceof FootballPlayer footballPlayer) {
            footballPlayer.shootBall();
        }
    }

    private boolean instanceOfWithCheck(String name) {
        record Person(String name, int age) {
        }

        Person jean = new Person("Jean", 25);

        //we can use pattern matching and access to the variable in one line
        return jean instanceof Person p && name.equals(p.name());
    }
}
