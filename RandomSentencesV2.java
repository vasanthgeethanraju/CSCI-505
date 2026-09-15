// Exercise 7.3: Random Sentences
// This program generates and displays 20 random sentences
// using words selected from four String arrays.

import java.util.random.RandomGenerator;

public class RandomSentencesV2 {
    private static final String[] article = { "the", "a", "one", "some", "any" };

    private static final String[] noun = { "boy", "girl", "dog", "town", "car" };

    private static final String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };

    private static final String[] preposition = { "to", "from", "over", "under", "on" };

    public static void main(String[] args) {
        // Create random number generator
        RandomGenerator random = RandomGenerator.getDefault();

        // Generate and display 20 random sentences
        int counter = 1;
        while(counter<=20) {
            // Build the sentence from randomly selected words
            StringBuilder sentence = new StringBuilder();

            sentence.append(article[random.nextInt(article.length)])
                    .append(" ")
                    .append(noun[random.nextInt(noun.length)])
                    .append(" ")
                    .append(verb[random.nextInt(verb.length)])
                    .append(" ")
                    .append(preposition[random.nextInt(preposition.length)])
                    .append(" ")
                    .append(article[random.nextInt(article.length)])
                    .append(" ")
                    .append(noun[random.nextInt(noun.length)]);

            // Capitalize the first character
            sentence.setCharAt(0, Character.toUpperCase(sentence.charAt(0)));

            // Add a period to the end
            sentence.append(".");

            // Display the completed sentence
            System.out.println(sentence);

            counter++;
        }
    }
}