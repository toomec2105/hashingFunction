package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hasher {
	
	

	public int hashUsingArrayList(String input) {
		if (input == null) {
			return -1;
		}
		String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		List<String> alphabet = new ArrayList<String>(Arrays.asList(letters));
		int hashCode = 0;

		for (int i = 0; i < input.length(); i++) {
			String letter = String.valueOf(input.charAt(i));
			int index = alphabet.indexOf(letter);
			if (index != -1) {
				hashCode += alphabet.indexOf(letter);
			}
		}
		return hashCode;
	}
}
