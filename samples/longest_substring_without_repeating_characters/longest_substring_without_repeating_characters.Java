Write a java function that Given a string s, find the length of the longest substring without repeating characters.


public static int lengthOfLongestSubstring(String s) {
    int maxLength = 0;
    Set<Character> charSet = new HashSet<>();
    int i = 0, j = 0;
    while (i < s.length() && j < s.length()) {
        if (!charSet.contains(s.charAt(j))) {
            charSet.add(s.charAt(j++));
            maxLength = Math.max(maxLength, j - i);
        } else {
            charSet.remove(s.charAt(i++));
        }
    }
    return maxLength;
}


public static int longestSubstringWithoutRepeating(String s) {
    int maxLength = 0;
    int currLength = 0;
    int[] index = new int[128];
    Arrays.fill(index, -1);
    for (int i = 0; i < s.length(); i++) {
        int prevIndex = index[s.charAt(i)];
        if (prevIndex == -1 || i - prevIndex > currLength) {
            currLength++;
        } else {
            if (currLength > maxLength) {
                maxLength = currLength;
            }
            currLength = i - prevIndex;
        }
        index[s.charAt(i)] = i;
    }
    if (currLength > maxLength) {
        maxLength = currLength;
    }
    return maxLength;
}


public static int lengthOfLongestSubstring(String s) {
    int maxLength = 0;
    int startIndex = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (map.containsKey(c)) {
            startIndex = Math.max(startIndex, map.get(c) + 1);
        }
        maxLength = Math.max(maxLength, i - startIndex + 1);
        map.put(c, i);
    }
    return maxLength;
}


public static int findLongestSubstringLength(String s) {
    int maxLength = 0;
    int curLength = 0;
    HashSet<Character> set = new HashSet<>();
    int start = 0;
    int end = 0;
    while (end < s.length()) {
        if (!set.contains(s.charAt(end))) {
            set.add(s.charAt(end));
            curLength++;
            end++;
            maxLength = Math.max(maxLength, curLength);
        } else {
            set.remove(s.charAt(start));
            start++;
            curLength--;
        }
    }
    return maxLength;
}


public static int longestSubstringWithoutRepeatingCharacters(String s) {
    int maxLength = 0;
    int start = 0;
    int end = 0;
    HashSet<Character> set = new HashSet<>();
    while (start < s.length() && end < s.length()) {
        if (!set.contains(s.charAt(end))) {
            set.add(s.charAt(end));
            end++;
            maxLength = Math.max(maxLength, end - start);
        } else {
            set.remove(s.charAt(start));
            start++;
        }
    }
    return maxLength;
}


public static int lengthOfLongestSubstring(String s) {
    int longest = 0;
    Set<Character> seen = new HashSet<>();
    int start = 0;
    int end = 0;
    while (end < s.length()) {
        char c = s.charAt(end);
        if (!seen.contains(c)) {
            seen.add(c);
            end++;
            longest = Math.max(longest, end - start);
        } else {
            seen.remove(s.charAt(start));
            start++;
        }
    }
    return longest;
}


public static int lengthOfLongestSubstring(String s) {
    int maxLength = 0;
    int startIndex = 0;
    Set<Character> characterSet = new HashSet<>();
    for(int i = 0; i < s.length(); i++) {
        char currChar = s.charAt(i);
        if(!characterSet.contains(currChar)) {
            characterSet.add(currChar);
            maxLength = Math.max(maxLength, characterSet.size());
        } else {
            while(startIndex < i && s.charAt(startIndex) != currChar) {
                characterSet.remove(s.charAt(startIndex));
                startIndex++;
            }
            startIndex++;
        }
    }
    return maxLength;
}


public static int longestSubstringWithoutRepeatingCharacters(String s) { 
  int maxLength = 0; 
  int start = 0; 
  int end = 0; 
  Set<Character> characters = new HashSet<>(); 
 
  while (end < s.length()) { 
    // If character is not in the set, add it 
    if (!characters.contains(s.charAt(end))) { 
      characters.add(s.charAt(end)); 
      end++; 
      maxLength = Math.max(maxLength, end - start); 
    } 
    else { 
      // Remove the first character from the set 
      characters.remove(s.charAt(start)); 
      start++; 
    } 
  } 
 
  return maxLength; 
}


public static int longestSubstringWithoutRepeatingCharacters(String s) {
    int maxLength = 0;
    int startIndex = 0;
    Map<Character, Integer> charMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        Character c = s.charAt(i);
        if (charMap.containsKey(c)) {
            startIndex = Math.max(startIndex, charMap.get(c) + 1);
        }
        maxLength = Math.max(maxLength, i - startIndex + 1);
        charMap.put(c, i);
    }
    return maxLength;
}


public static int longestSubstring(String s) { 
	int maxLen = 0; 
	HashSet<Character> set = new HashSet<>(); 
	int i = 0, j = 0; 
	while (i < s.length() && j < s.length()) { 
		if (!set.contains(s.charAt(j))) { 
			set.add(s.charAt(j++)); 
			maxLen = Math.max(maxLen, j - i); 
		} 
		else { 
			set.remove(s.charAt(i++)); 
		} 
	} 
	return maxLen; 
}


public static int lengthOfLongestSubstring(String s) {
    int maxLength = 0;
    int currentLength = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (map.containsKey(c)) {
            maxLength = Math.max(maxLength, currentLength);
            currentLength = Math.min(i - map.get(c), currentLength + 1);
        } else {
            currentLength++;
        }
        map.put(c, i);
    }
    maxLength = Math.max(maxLength, currentLength);
    return maxLength;
}


public static int lengthOfLongestSubstring(String s) {
    int maxLength = 0;
    int start = 0;
    int end = 0;
    Set<Character> charSet = new HashSet<>();
    while (start < s.length() && end < s.length()) {
        if (!charSet.contains(s.charAt(end))) {
            charSet.add(s.charAt(end++));
            maxLength = Math.max(maxLength, end - start);
        } else {
            charSet.remove(s.charAt(start++));
        }
    }
    return maxLength;
}


public static int lengthOfLongestSubstring(String s) { 
  int maxLength = 0; 
  int currentLength = 0; 
  HashMap<Character, Integer> charMap = new HashMap<Character, Integer>(); 
  
  for (int i = 0; i < s.length(); i++) { 
    char currentChar = s.charAt(i); 
    if (charMap.containsKey(currentChar)) { 
      currentLength = Math.max(charMap.get(currentChar) + 1, currentLength); 
    } 
    maxLength = Math.max(maxLength, i - currentLength + 1); 
    charMap.put(currentChar, i); 
  } 
  return maxLength; 
}


public static int longestSubstringWithoutRepeatingChars(String s) {
    int maxLength = 0;
    int startIndex = 0;
    Map<Character, Integer> charMap = new HashMap<>();
 
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (charMap.containsKey(c)) {
            startIndex = Math.max(startIndex, charMap.get(c) + 1);
        }
        charMap.put(c, i);
        maxLength = Math.max(maxLength, i - startIndex + 1);
    }
    return maxLength;
}


public static int lengthOfLongestSubstring(String s) {
	int longest = 0;
	int start = 0;
	int end = 0;
	HashSet<Character> set = new HashSet<Character>();

	while (start < s.length() && end < s.length()) {
		if (!set.contains(s.charAt(end))) {
			set.add(s.charAt(end++));
			longest = Math.max(longest, end - start);
		} else {
			set.remove(s.charAt(start++));
		}
	}
	return longest;
}


public static int lengthOfLongestSubstring(String s) {
    int maxLength = 0;
    int startIndex = 0;
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (!set.contains(c)) {
            set.add(c);
            maxLength = Math.max(maxLength, i - startIndex + 1);
        } else {
            while (startIndex < i && s.charAt(startIndex) != c) {
                set.remove(s.charAt(startIndex));
                startIndex++;
            }
            startIndex++;
        }
    }
    return maxLength;
}


public static int longestSubstringWithoutRepeatingCharacters(String s) {
    int maxLength = 0;
    int currLength = 0;
    int[] lastIndex = new int[256];
    Arrays.fill(lastIndex, -1);
    int start = 0;
    for (int i = 0; i < s.length(); i++) {
        char curr = s.charAt(i);
        if (lastIndex[curr] == -1 || lastIndex[curr] < start) {
            currLength++;
        } else {
            maxLength = Math.max(maxLength, currLength);
            start = lastIndex[curr] + 1;
            currLength = i - start + 1;
        }
        lastIndex[curr] = i;
    }
    maxLength = Math.max(maxLength, currLength);
    return maxLength;
}


public static int longestSubstringWithoutRepeatingCharacters(String s) { 
    int maxLength = 0; 
    int length = 0; 
    int[] lastSeen = new int[256]; 
    for (int i = 0; i < lastSeen.length; i++) { 
        lastSeen[i] = -1; 
    } 
    for (int i = 0; i < s.length(); i++) { 
        char c = s.charAt(i); 
        if (lastSeen[c] == -1 || i - lastSeen[c] > length) { 
            length++; 
        } else { 
            maxLength = Math.max(maxLength, length); 
            length = i - lastSeen[c]; 
        } 
        lastSeen[c] = i; 
    } 
    maxLength = Math.max(maxLength, length); 
    return maxLength; 
}


public static int longestSubstringWithoutRepeatingCharacters(String s) {
    int maxLength = 0;
    int start = 0;
    HashMap<Character, Integer> charMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (charMap.containsKey(c)) {
            int prevIndex = charMap.get(c);
            start = Math.max(start, prevIndex + 1);
        }
        maxLength = Math.max(maxLength, i - start + 1);
        charMap.put(c, i);
    }
    return maxLength;
}


public static int longestSubstringWithoutRepeatingCharacters(String s) {
    int maxLength = 0;
    int currLength = 0;
    int startIndex = 0;
    HashSet<Character> seen = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (!seen.contains(c)) {
            seen.add(c);
            currLength++;
            if (currLength > maxLength) {
                maxLength = currLength;
            }
        } else {
            // reset the seen set and start index
            seen = new HashSet<>();
            startIndex++;
            i = startIndex;
            currLength = 0;
        }
    }

    return maxLength;
}
