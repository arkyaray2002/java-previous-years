package Batch2;
import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "Hello World";

        // Creating a HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Calculating frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isWhitespace(ch)) // Skipping whitespaces
                continue;

            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Printing character frequencies
        System.out.println("Character frequencies:");
        for (char ch : frequencyMap.keySet()) {
            System.out.println("'" + ch + "' => " + frequencyMap.get(ch));
        }
    }
}
