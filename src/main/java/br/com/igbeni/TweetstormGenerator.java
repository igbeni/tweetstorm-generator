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
        int pagging = 3;

        // FIXME: 24/04/2018 
        while (numOfDigitsMax != numOfDigits) {
            round = (int) Math.ceil(text.length() * 1.0 / (140 - pagging));
            numOfDigits = (int) Math.ceil(Math.log10(round));
            pagging = (2 * numOfDigits + 1);
        }

        System.out.println(round);

        final List<String> tweets = new ArrayList<>(round);

        StringBuilder sb = new StringBuilder();
        sb.append(tweets.size()+1).append("/").append(round).append(" ");

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (sb.length() + word.length() <= (140 - pagging)) {
                sb.append(word).append(" ");
            } else {
                tweets.add(sb.toString());
                sb = new StringBuilder();
                sb.append(tweets.size() + 1)
                        .append("/")
                        .append(round)
                        .append(" ")
                        .append(word)
                        .append(" ");
            }
        }

        tweets.add(sb.toString());

        return tweets;
    }
}
