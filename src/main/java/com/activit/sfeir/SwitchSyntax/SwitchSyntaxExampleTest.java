package com.activit.sfeir.SwitchSyntax;

import org.junit.jupiter.api.Test;

public class SwitchSyntaxExampleTest {

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

    private String switchReturnValue(String day) {
        return switch (day) {
            case "Monday", "Tuesday" -> "Working from office";
            case "Wednesday", "Thursday", "Friday" -> "Working Remotely";
            default -> "Not a working day";
        };
    }

    private void switchToSetVariable(int height) {
        String clothingSizing = switch (height) {
            case 160 -> "XS";
            case 170 -> "S";
            case 180 -> "M";
            case 190 -> "L";
            default -> "Give us a rounded value";

        };
        System.out.println(clothingSizing);
    }

    private void switchUsingYieldKeyWord(int seats) {
        //yield key word is used to produce a value from a case block surrounding by '{}' in a switch statement
        var type = switch (seats) {
            case 1 -> "small";
            case 2, 3 -> {
                //just to showing the new key word yield
                var mid = "medium ";
                yield mid + seats;
            }
            default -> {
                var s = "this 's' is a new variable because we are in another scope";
                yield "big";
            }
        };
        System.out.println(type);
    }

    private void switchOnType(Animal animal) {
        var sound = switch (animal) {
            case Cat cat -> cat.meow();
            case Dog dog -> dog.ouaf();
            default -> "Meuh";
        };

        System.out.println(sound);
    }

    @Test
    public void switchSyntaxExample() {
        //Will print the same thing
        oldSwitchSyntax("Pauleta");
        newSwitchSyntax("Pauleta");
        System.out.println(switchReturnValue("Wednesday"));
        switchToSetVariable(180);
        switchUsingYieldKeyWord(3);

        Animal idefix = new Dog("ouaf");
        switchOnType(idefix);
    }

    interface Animal {
    }

    record Dog(String ouaf) implements Animal {
    }

    record Cat(String meow) implements Animal {
    }
}
