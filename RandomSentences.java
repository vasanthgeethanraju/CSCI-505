import java.util.Random;

public class RandomSentences {
    // Arrays containing the words
    private static String[] article = { "the", "a", "one", "some", "any" };

    private static String[] noun = { "boy", "girl", "dog", "town", "car" };

    private static String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };

    private static String[] preposition = { "to", "from", "over", "under", "on" };

    private static String sentence;
    private static int counter;
    private static Random random;

    public static void main(String[] args) {
        random = new Random(); // Create Random object
        counter = 1; // Set counter to 1
        
        while(counter <= 20) { // Generate 20 sentences
            // Randomly select words from each array
            String selectedArticle1 = article[random.nextInt(article.length)];

            String selectedNoun1 = noun[random.nextInt(noun.length)];

            String selectedVerb = verb[random.nextInt(verb.length)];

            String selectedPreposition = preposition[random.nextInt(preposition.length)];

            String selectedArticle2 = article[random.nextInt(article.length)];

            String selectedNoun2 = noun[random.nextInt(noun.length)];

            // Concatenate the words with spaces
            sentence = selectedArticle1 + " " + selectedNoun1 + " " + selectedVerb + " " + selectedPreposition + " " 
                        + selectedArticle2 + " " + selectedNoun2;

            // Capitalize the first letter
            sentence = Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);

            // Add a period
            sentence += ".";

            // Display the sentence
            System.out.println(sentence);

            // Increase counter
            counter += 1;
        }
    }
}
