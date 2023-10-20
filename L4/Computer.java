public class Computer {
	public static void main(String[] args) {
		String originalWord = "Computer";
		
		System.out.println("Original Word: " + originalWord);
		System.out.println("Uppercase: " + originalWord.toUpperCase());
		System.out.println("Lowercase: " + originalWord.toLowerCase());
		System.out.println("Lenght of the Word: " + originalWord.length());
		
		char firstChar = originalWord.charAt(0);
		char middleChar = originalWord.charAt((originalWord.length() / 2));
		char lastChar = originalWord.charAt((originalWord.length() - 1));
		
		System.out.println("First Letter: " + firstChar);
		System.out.println("Second Letter: " + middleChar);
		System.out.println("Third Letter: " + lastChar);
		
		System.out.println("Starts with 'Com':" + originalWord.startsWith("Com"));
		System.out.println("Ends with 'ion': " + originalWord.endsWith("ion"));
		
		String firstTwoLetters = originalWord.substring(0, 2);
		System.out.println("First Two Letters: " + firstTwoLetters);
		
		String swappedWord = originalWord.replace('e','o');
		System.out.println("Swapped 'e' with 'o': " + swappedWord);
		
		String replacedSegment = originalWord.replace("Compu",  "Calcula");
		System.out.println("Replaced 'Compu' with 'Calcula': " + replacedSegment);
	}
}
