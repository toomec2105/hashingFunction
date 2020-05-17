package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class Hasher {
	private final String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

	public int hashUsingArrayList(String input) {
		if (input == null) {
			return -1;
		}
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

	public int hashUsingHashMap(String input) {
		if (input == null) {
			return -1;
		}

		HashMap<String, Integer> alphabet = new HashMap<String, Integer>();
		for (int i = 0; i < letters.length; i++) {
			alphabet.put(letters[i], i);
		}

		int hashCode = 0;

		for (int i = 0; i < input.length(); i++) {
			String letter = String.valueOf(input.charAt(i));
			Integer hash = alphabet.get(letter);

			if (null != hash) {
				hashCode += hash;
			}
		}

		return hashCode;
	}
}
