package com.activit.sfeir.SwitchSyntax;

import org.junit.jupiter.api.Test;

public class SwitchSyntaxExampleTest {

    @Test
    public void switchSyntaxExample() {
        oldSwitchSyntax("Pauleta");
        newSwitchSyntax("Pauleta");
    }

    private void oldSwitchSyntax(String player) {
        switch (player) {
            case "Ronaldinho":
                System.out.println("Retired");
                break;
            case "Mbappe", "Pauleta":
                System.out.println("PSG");
                break;
            case "Ronaldo":
                System.out.println("Real Madrid");
            default:
                System.out.println("Nothing");
                break;
        }
    }

    private void newSwitchSyntax(String player) {
        switch (player) {
            case "Ronaldinho" -> System.out.println("Retired");
            case "Mbappe", "Pauleta" -> System.out.println("PSG");
            case "Ronaldo" -> System.out.println("Real Madrid");
            default -> System.out.println("Nothing");
        }
    }
}
