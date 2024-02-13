package Batch1;

public class WordReversal {
    
    public static void main(String[] args) {
        String input = "Hello world! we are CMSA Student.";
        reverseWords(input);
    }
    
    public static void reverseWords(String input) {
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Count the number of words
        int wordCount = words.length;
        System.out.println("Total words: " + wordCount);
        
        // Reverse each word and display
        System.err.println("Output string with reversed words:");
        for (String word : words) {
            String reversedWord = reverseString(word);
            System.out.print(reversedWord + " ");
        }
    }
    
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
