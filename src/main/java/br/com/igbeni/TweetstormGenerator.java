package br.com.igbeni;

import java.util.ArrayList;
import java.util.List;

public class TweetstormGenerator {

    public static final int NUM_OF_DIGITS = 3;

    public static List<String> generateTweetstorm(String text) {
        if (text == null || text.length() == 0) {
            return null;
        }

        int round = (int) Math.ceil(text.length() * 1.0 / (140 - 2 * (NUM_OF_DIGITS * 2 + 2)));


        final List<String> tweets = new ArrayList<>(round);

        StringBuilder sb = new StringBuilder();

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (sb.length() + word.length() < (140 - 2 * (NUM_OF_DIGITS * 2 + 2))) {
                sb.append(word).append(" ");
            } else {
                tweets.add(sb.toString());
                sb = new StringBuilder();
                sb.append(word)
                        .append(" ");
            }
        }

        tweets.add(sb.toString());

        for (int i = 0; i < tweets.size(); i++) {
            tweets.set(i, formatPagging(i + 1, tweets) + tweets.get(i));
        }

        return tweets;
    }

    private static String formatPagging(int current, List<String> tweets) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < NUM_OF_DIGITS - Integer.toString(current).length(); i++) {
            sb.append(" ");
        }

        sb.append(current)
                .append("/")
                .append(tweets.size());

        for (int i = 0; i < NUM_OF_DIGITS - Integer.toString(tweets.size()).length(); i++) {
            sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("You must enter a text.");
        }

        for (String tweet : generateTweetstorm(args[0])) {
            System.out.println(tweet);
        }
    }
}
