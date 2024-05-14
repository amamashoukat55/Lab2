import java.util.HashSet;
import java.util.Set;

public class TextAnalyzer {
    public static void main(String[] args) {
        String paragraph = "The quick brown fox jumps over the lazy dog. This is a sample sentence. It contains some words that will be analyzed. The quick brown fox jumps over the lazy dog.";

        // Split paragraph into sentences
        String[] sentences = paragraph.split("[.!?]");

        // Count sentences
        int sentenceCount = sentences.length;

        // Split paragraph into words
        String[] words = paragraph.split("\\s+");

        // Count words
        int wordCount = words.length;

        // Create a set to store unique words
        Set<String> uniqueWords = new HashSet<>();

        // Count unique words
        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); // Convert to lowercase to count unique words case-insensitively
        }
        int uniqueWordCount = uniqueWords.size();

        // Output results
        System.out.println("Number of sentences: " + sentenceCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of unique words: " + uniqueWordCount);
    }
}
