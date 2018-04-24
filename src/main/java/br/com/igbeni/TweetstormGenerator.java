package br.com.igbeni;

import java.util.ArrayList;
import java.util.List;

public class TweetstormGenerator {

    public static List<String> generateTweetstorm(String text) {
        if (text == null || text.length() == 0) {
            return null;
        }

        int round = (int) Math.ceil(text.length() * 1.0 / 140);
        int numOfDigitsMax = (int) Math.ceil(Math.log10(round));
        int numOfDigits = 0;

        while (numOfDigitsMax != numOfDigits) {
            round = (int) Math.ceil(text.length() * 1.0 / (140 - 2 * numOfDigitsMax + 2));
            numOfDigits = (int) Math.ceil(Math.log10(round));
        }

        System.out.println(round);
        System.out.println(numOfDigits);

        final List<String> tweets = new ArrayList<>(round);

        

        return tweets;
    }
}
