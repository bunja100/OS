
public class Question1 {
	public static void main(String[] args) {
		String sentenceString = "principles of operating systems";
		char firstCharacter = sentenceString.charAt(0);
		char lastCharacter = sentenceString.charAt(sentenceString.length() - 1);
		String extractString = sentenceString.substring(14, 23);

		System.out.println("First Charcter is: " + firstCharacter);
		System.out.println("Last Charcter is: " + lastCharacter);
		System.out.println("The Substring is: " + extractString);
	}
}
