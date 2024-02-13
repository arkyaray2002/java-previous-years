package Batch2;

public class ConsonantRemoval {
	public static void main(String[] args) {
		String inputString = "Hello world! we are CMSA Student.";
		String result = removeConsonant(inputString);
		System.out.println("Resultant String : " + result);
	}
	
	static String removeConsonant (String input) {
		// Define a regular expression to match consonants
        String consonantsRegex = "[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]";
        
        // Remove consonants from the input string
        String result = input.replaceAll(consonantsRegex, "");
        
        return result;
	}
}
