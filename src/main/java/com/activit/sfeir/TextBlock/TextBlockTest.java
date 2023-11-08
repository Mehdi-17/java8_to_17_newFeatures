package com.activit.sfeir.TextBlock;

import org.junit.jupiter.api.Test;

public class TextBlockTest {

    @Test
    public void multiLineTextTest() {
        String oldMultiLinesTextBlock = "{\n" +
                "   \"name\":\"Cristiano\",\n" +
                "   \"lastName\":\"Ronaldo\",\n" +
                "   \"sport\":\"Football\",\n" +
                "   \"age\":38,\n" +
                "   \"jerseyNumber\":7\n" +
                "}";

        System.out.println(oldMultiLinesTextBlock);

        String newMultiLinesTextBlock = """
                {
                   "name":"Cristiano",
                   "lastName":"Ronaldo",
                   "sport":"Football",
                   "age":38,
                   "jerseyNumber":7
                }
                """;

        System.out.println(newMultiLinesTextBlock);
    }
}
