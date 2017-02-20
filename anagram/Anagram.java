import java.util.*;
public class Anagram {
	private String str1;

	Anagram(String str1) {
		this.str1 = str1;
	}

	String getObjectValue() {
		return str1;
	}

	boolean isAnagramSB(String str2) {
		/* Remove Spaces and convert to lowercase */
		str1 = str1.replaceAll("\\s+", "").toLowerCase();
		str2 = str2.replaceAll("\\s+", "").toLowerCase();

		/* check if any string is null */
		if (str1 == null || str2 == null) return false;

		/* check if length of both the strings are same */
		if (str1.length() != str2.length()) return false;

		/*convert string to stringbuilder (immutable to mutable for future alterations) */
		StringBuilder sb = new StringBuilder(str1);


		for (char c : str2.toCharArray()) {
			int index = sb.indexOf(c + "");
			if (index == -1) return false;
			sb.delete(index, index + 1);
		}
		return true;
	}

	boolean isAnagramMap(String str2) {
		/* Remove Spaces and convert to lowercase */
		str1 = str1.replaceAll("\\s+", "").toLowerCase();
		str2 = str2.replaceAll("\\s+", "").toLowerCase();

		/* check if any string is null */
		if (str1 == null || str2 == null) return false;

		/* check if length of both the strings are same */
		if (str1.length() != str2.length()) return false;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str2.length(); i++) {
			char charAsKey = str1.charAt(i);
			int charCountAsValue = 0;
			if (hm.containsKey(charAsKey)) charCountAsValue = hm.get(charAsKey);
			hm.put(charAsKey, ++charCountAsValue);
			charAsKey = str2.charAt(i);
			charCountAsValue = 0;
			if (hm.containsKey(charAsKey)) charCountAsValue = hm.get(charAsKey);
			hm.put(charAsKey, --charCountAsValue);
		}
		for (int value : hm.values()) {
			if (value != 0)
				return false;
		}
		return true;
	}

	void isAnagram(Anagram anagram) {
		String str = str1;
		String str2 = anagram.getObjectValue();
		System.out.println(str + " and " + str2 + " are anagrams (HashMap) : " + anagram.isAnagramSB(str));
		System.out.println(str + " and " + str2 + " are anagrams (StringBuilder) : " + anagram.isAnagramMap(str));
	}
}

/*/*static boolean isAnagram(String str1, String str2) {
		/* Remove Spaces and convert to lowercase */
		str1 = str1.replaceAll("\\s+", "").toLowerCase();
		str2 = str2.replaceAll("\\s+", "").toLowerCase();

		/* check if any string is null */
		if (str1 == null || str2 == null) return false;

		/* check if length of both the strings are same */
		if (str1.length() != str2.length()) return false;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str2.length(); i++) {
			char charAsKey = str1.charAt(i);
			int charCountAsValue = 0;
			if (hm.containsKey(charAsKey)) charCountAsValue = hm.get(charAsKey);
			hm.put(charAsKey, ++charCountAsValue);
			charAsKey = str2.charAt(i);
			charCountAsValue = 0;
			if (hm.containsKey(charAsKey)) charCountAsValue = hm.get(charAsKey);
			hm.put(charAsKey, --charCountAsValue);
		}
		for (int value : hm.values()) {
			if (value != 0)
				return false;
		}
		return true;
	}*/