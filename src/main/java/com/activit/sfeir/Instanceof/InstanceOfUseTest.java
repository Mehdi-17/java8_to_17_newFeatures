package com.activit.sfeir.Instanceof;

import org.junit.jupiter.api.Test;

public class InstanceOfUseTest {

    @Test
    public void instanceOfTest() {
        AbstractPlayer basketballPlayer = new BasketballPlayer();
        AbstractPlayer footballPlayer = new FootballPlayer();

        useOldInstanceOf(footballPlayer);
        useNewInstanceOf(basketballPlayer);
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
}
