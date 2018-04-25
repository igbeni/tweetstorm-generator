package br.com.igbeni;

import java.util.ArrayList;
import java.util.List;

public class TweetstormGenerator {

    /**
     * Method to swap two elements of an array of integers.
     *
     * @param arr An array of integers.
     */
    private static void swap(int[] arr) {
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];
        arr[0] = arr[0] ^ arr[1];
    }

    /**
     * Method to generate a tweetstorm from a text.
     *
     * @param text The text to be transformed into tweetstorm.
     * @return A list of tweets.
     */
    static List<String> generateTweetstorm(String text) {
        if (text == null || text.length() == 0) {
            return null;
        }

        int numOfDigits = calculateNumberOfDigits(text.length());

        final List<String> tweets = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (sb.length() + word.length() < (140 - 4 * (numOfDigits + 1))) {
                sb.append(word).append(" ");
            } else {
                tweets.add(sb.toString());
                sb = new StringBuilder();
                sb.append(word)
                        .append(" ");
            }
        }

        tweets.add(sb.toString());

        formatPaging(tweets, numOfDigits);

        return tweets;
    }

    /**
     * Method that calculates the number of digits for paging of tweets.
     *
     * @param length The length of the text.
     * @return The number of digits in pagination.
     */
    private static int calculateNumberOfDigits(int length) {
        int round = (int) Math.ceil(length * 1.0 / 140);
        int[] numOfDigits = new int[]{0, (int) Math.ceil(Math.log10(round))};

        int paging = 4 * (numOfDigits[1] + 1);

        while (numOfDigits[1] != numOfDigits[0]) {
            swap(numOfDigits);
            round = (int) Math.ceil(length * 1.0 / (140 - paging));
            numOfDigits[1] = (int) Math.ceil(Math.log10(round));
            paging = 4 * (numOfDigits[1] + 1);
        }

        return numOfDigits[0];
    }

    /**
     * Method that formats and inserts pagination into a list of tweets.
     *
     * @param tweets     The list of tweets.
     * @param numOfDigit The number of digits in pagination.
     */
    private static void formatPaging(List<String> tweets, int numOfDigit) {
        for (int i = 0; i < tweets.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < numOfDigit - Integer.toString(i + 1).length(); j++) {
                sb.append(" ");
            }

            sb.append(i + 1)
                    .append("/")
                    .append(tweets.size())
                    .append(" ");

            for (int j = 0; j < numOfDigit - Integer.toString(tweets.size()).length(); j++) {
                sb.append(" ");
            }

            tweets.set(i, sb.toString() + tweets.get(i));
        }
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
