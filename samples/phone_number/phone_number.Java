Write a java function that Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order. A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            List<String> next = new ArrayList<>();
            int index = Character.getNumericValue(digits.charAt(i));
            for (String s : result) {
                for (int j = 0; j < map[index].length(); j++) {
                    next.add(s + map[index].charAt(j));
                }
            }
            result = next;
        }
        return result;
    }
}


public static List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return result;
    }
    Map<Character, char[]> map = new HashMap<>();
    map.put('2', new char[]{'a', 'b', 'c'});
    map.put('3', new char[]{'d', 'e', 'f'});
    map.put('4', new char[]{'g', 'h', 'i'});
    map.put('5', new char[]{'j', 'k', 'l'});
    map.put('6', new char[]{'m', 'n', 'o'});
    map.put('7', new char[]{'p', 'q', 'r', 's'});
    map.put('8', new char[]{'t', 'u', 'v'});
    map.put('9', new char[]{'w', 'x', 'y', 'z'});
    StringBuilder sb = new StringBuilder();
    backtrack(result, sb, digits, 0, map);
    return result;
}

private static void backtrack(List<String> result, StringBuilder sb, String digits, int index, Map<Character, char[]> map) {
    if (index == digits.length()) {
        result.add(sb.toString());
        return;
    }
    char c = digits.charAt(index);
    char[] arr = map.get(c);
    for (int i = 0; i < arr.length; i++) {
        sb.append(arr[i]);
        backtrack(result, sb, digits, index + 1, map);
        sb.deleteCharAt(sb.length() - 1);
    }
}


public static List<String> letterCombinations(String digits) {
    LinkedList<String> ans = new LinkedList<String>();
    if(digits.isEmpty()) return ans;
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for(int i =0; i<digits.length();i++){
        int x = Character.getNumericValue(digits.charAt(i));
        while(ans.peek().length()==i){
            String t = ans.remove();
            for(char s : mapping[x].toCharArray())
                ans.add(t+s);
        }
    }
    return ans;
}


public static List<String> letterCombinations(String digits) {
    LinkedList<String> ans = new LinkedList<>();
    if(digits.isEmpty()) return ans;
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for(int i =0; i<digits.length();i++){
        int x = Character.getNumericValue(digits.charAt(i));
        while(ans.peek().length()==i){
            String t = ans.remove();
            for(char s : mapping[x].toCharArray())
                ans.add(t+s);
        }
    }
    return ans;
}


public static List<String> letterCombinations(String digits) {
    List<String> combinations = new ArrayList<>();
    if (digits.length() == 0) {
        return combinations;
    }
    Map<Character, char[]> map = new HashMap<>();
    map.put('2', new char[] {'a', 'b', 'c'});
    map.put('3', new char[] {'d', 'e', 'f'});
    map.put('4', new char[] {'g', 'h', 'i'});
    map.put('5', new char[] {'j', 'k', 'l'});
    map.put('6', new char[] {'m', 'n', 'o'});
    map.put('7', new char[] {'p', 'q', 'r', 's'});
    map.put('8', new char[] {'t', 'u', 'v'});
    map.put('9', new char[] {'w', 'x', 'y', 'z'});
    
    StringBuilder sb = new StringBuilder();
    backtrack(combinations, map, digits, sb);
    return combinations;
}

private static void backtrack(List<String> combinations, Map<Character, char[]> map, String digits, StringBuilder sb) {
    if (sb.length() == digits.length()) {
        combinations.add(sb.toString());
        return;
    }
    char digit = digits.charAt(sb.length());
    char[] letters = map.get(digit);
    for (char letter : letters) {
        sb.append(letter);
        backtrack(combinations, map, digits, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}


public List<String> letterCombinations(String digits) {
    Map<Character, String> map = new HashMap<>();
    map.put('2', "abc");
    map.put('3', "def");
    map.put('4', "ghi");
    map.put('5', "jkl");
    map.put('6', "mno");
    map.put('7', "pqrs");
    map.put('8', "tuv");
    map.put('9', "wxyz");
    List<String> result = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return result;
    }
    backtrack(result, map, new StringBuilder(), digits, 0);
    return result;
}

private void backtrack(List<String> result, Map<Character, String> map, StringBuilder sb, String digits, int index) {
    if (index == digits.length()) {
        result.add(sb.toString());
        return;
    }
    char digit = digits.charAt(index);
    String letters = map.get(digit);
    for (int i = 0; i < letters.length(); i++) {
        sb.append(letters.charAt(i));
        backtrack(result, map, sb, digits, index + 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}


public List<String> letterCombinations(String digits) {
    
    List<String> result = new ArrayList<>();
    if (digits.length() == 0) {
        return result;
    }
    Map<Character, char[]> map = new HashMap<>();
    map.put('2', new char[]{'a', 'b', 'c'});
    map.put('3', new char[]{'d', 'e', 'f'});
    map.put('4', new char[]{'g', 'h', 'i'});
    map.put('5', new char[]{'j', 'k', 'l'});
    map.put('6', new char[]{'m', 'n', 'o'});
    map.put('7', new char[]{'p', 'q', 'r', 's'});
    map.put('8', new char[]{'t', 'u', 'v'});
    map.put('9', new char[]{'w', 'x', 'y', 'z'});
    
    char[] arr = new char[digits.length()];
    helper(result, map, arr, 0, digits);
    return result;
}

public void helper(List<String> result, Map<Character, char[]> map, char[] arr, int index, String digits) {
    if (index == digits.length()) {
        result.add(new String(arr));
        return;
    }
    char c = digits.charAt(index);
    char[] choices = map.get(c);
    for (int i = 0; i < choices.length; i++) {
        arr[index] = choices[i];
        helper(result, map, arr, index + 1, digits);
    }
}


public List<String> letterCombinations(String digits) {
    Map<Character, List<Character>> map = new HashMap<>();
    map.put('2', Arrays.asList('a','b','c'));
    map.put('3', Arrays.asList('d','e','f'));
    map.put('4', Arrays.asList('g','h','i'));
    map.put('5', Arrays.asList('j','k','l'));
    map.put('6', Arrays.asList('m','n','o'));
    map.put('7', Arrays.asList('p','q','r','s'));
    map.put('8', Arrays.asList('t','u','v'));
    map.put('9', Arrays.asList('w','x','y','z'));
    List<String> result = new ArrayList<>();
    
    if (digits.length() == 0) {
        return result;
    }
    helper(map, digits, result, new StringBuilder(), 0);
    return result;
}

private void helper(Map<Character, List<Character>> map, String digits, List<String> result, StringBuilder sb, int index) {
    if (index == digits.length()) {
        result.add(sb.toString());
        return;
    }
    List<Character> letters = map.get(digits.charAt(index));
    for (int i = 0; i < letters.size(); i++) {
        sb.append(letters.get(i));
        helper(map, digits, result, sb, index + 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}


public static List<String> letterCombinations(String digits) {
    if (digits.length() == 0) {
        return new ArrayList<>();
    }
    
    Map<Character, List<Character>> map = new HashMap<>();
    map.put('2', Arrays.asList('a', 'b', 'c'));
    map.put('3', Arrays.asList('d', 'e', 'f'));
    map.put('4', Arrays.asList('g', 'h', 'i'));
    map.put('5', Arrays.asList('j', 'k', 'l'));
    map.put('6', Arrays.asList('m', 'n', 'o'));
    map.put('7', Arrays.asList('p', 'q', 'r', 's'));
    map.put('8', Arrays.asList('t', 'u', 'v'));
    map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    
    List<String> result = new ArrayList<>();
    result.add("");
    for (int i = 0; i < digits.length(); i++) {
        List<String> temp = new ArrayList<>();
        for (char c : map.get(digits.charAt(i))) {
            for (String str : result) {
                temp.add(str + c);
            }
        }
        result = temp;
    }
    
    return result;
}


public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (digits.length() == 0) {
        return result;
    }
    String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    backtrack(result, map, new StringBuilder(), digits, 0);
    return result;
}

public void backtrack(List<String> result, String[] map, StringBuilder sb, String digits, int index) {
    if (index == digits.length()) {
        result.add(sb.toString());
        return;
    }
    String str = map[digits.charAt(index) - '0'];
    for (int i = 0; i < str.length(); i++) {
        sb.append(str.charAt(i));
        backtrack(result, map, sb, digits, index + 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}


public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;
        String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(res, digits, "", 0, map);
        return res;
    }
    
    private void backtrack(List<String> res, String digits, String cur, int index, String[] map) {
        if (index == digits.length()) {
            res.add(cur);
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            backtrack(res, digits, cur + letters.charAt(i), index + 1, map);
        }
    }
}


Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

public List<String> letterCombinations(String digits) {
    LinkedList<String> ans = new LinkedList<String>();
    if(digits.isEmpty()) return ans;
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for(int i =0; i<digits.length();i++){
        int x = Character.getNumericValue(digits.charAt(i));
        while(ans.peek().length()==i){
            String t = ans.remove();
            for(char s : mapping[x].toCharArray())
                ans.add(t+s);
        }
    }
    return ans;
}


public List<String> letterCombinations(String digits) {
    HashMap<Character, char[]> map = new HashMap<>();
    map.put('2', new char[]{'a','b','c'});
    map.put('3', new char[]{'d','e','f'});
    map.put('4', new char[]{'g','h','i'});
    map.put('5', new char[]{'j','k','l'});
    map.put('6', new char[]{'m','n','o'});
    map.put('7', new char[]{'p','q','r','s'});
    map.put('8', new char[]{'t','u','v'});
    map.put('9', new char[]{'w','x','y','z'});
    
    List<String> result = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return result;
    }
    
    char[] arr = new char[digits.length()];
    helper(digits, 0, map, result, arr);
    return result;
}

public void helper(String digits, int index, HashMap<Character, char[]> map, List<String> result, char[] arr) {
    if (index == digits.length()) {
        result.add(new String(arr));
        return;
    }
    
    char digit = digits.charAt(index);
    char[] letters = map.get(digit);
    for (int i = 0; i < letters.length; i++) {
        arr[index] = letters[i];
        helper(digits, index + 1, map, result, arr);
    }
}


public static List<String> letterCombinations(String digits) {
  HashMap<Character, String> map = new HashMap<>();
  map.put('2', "abc");
  map.put('3', "def");
  map.put('4', "ghi");
  map.put('5', "jkl");
  map.put('6', "mno");
  map.put('7', "pqrs");
  map.put('8', "tuv");
  map.put('9', "wxyz");

  List<String> result = new ArrayList<>();
  if (digits.length() == 0) return result;

  dfs(digits, 0, new StringBuilder(), map, result);
  return result;
}

public static void dfs(String digits, int start, StringBuilder sb, HashMap<Character, String> map, List<String> result) {
  if (start == digits.length()) {
    result.add(sb.toString());
    return;
  }

  String letters = map.get(digits.charAt(start));
  for (int i = 0; i < letters.length(); i++) {
    sb.append(letters.charAt(i));
    dfs(digits, start + 1, sb, map, result);
    sb.deleteCharAt(sb.length() - 1);
  }
}


Example: 
Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

public static List<String> letterCombinations(String digits) {
    Map<Character, List<Character>> map = new HashMap<Character, List<Character>>() {{
        put('2', Arrays.asList('a', 'b', 'c'));
        put('3', Arrays.asList('d', 'e', 'f'));
        put('4', Arrays.asList('g', 'h', 'i'));
        put('5', Arrays.asList('j', 'k', 'l'));
        put('6', Arrays.asList('m', 'n', 'o'));
        put('7', Arrays.asList('p', 'q', 'r', 's'));
        put('8', Arrays.asList('t', 'u', 'v'));
        put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }};
    List<String> result = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return result;
    }
    backtrack(result, map, digits, new StringBuilder(), 0);
    return result;
}

private static void backtrack(List<String> result, Map<Character, List<Character>> map, String digits, StringBuilder sb, int index) {
    if (index == digits.length()) {
        result.add(sb.toString());
        return;
    }
    List<Character> letters = map.get(digits.charAt(index));
    for (int i = 0; i < letters.size(); i++) {
        sb.append(letters.get(i));
        backtrack(result, map, digits, sb, index + 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}


public static List<String> letterCombinations(String digits) {
    if (digits.length() == 0) {
        return new ArrayList<>();
    }
    
    Map<Character, char[]> phoneMap = new HashMap<>();
    phoneMap.put('2', new char[]{'a', 'b', 'c'});
    phoneMap.put('3', new char[]{'d', 'e', 'f'});
    phoneMap.put('4', new char[]{'g', 'h', 'i'});
    phoneMap.put('5', new char[]{'j', 'k', 'l'});
    phoneMap.put('6', new char[]{'m', 'n', 'o'});
    phoneMap.put('7', new char[]{'p', 'q', 'r', 's'});
    phoneMap.put('8', new char[]{'t', 'u', 'v'});
    phoneMap.put('9', new char[]{'w', 'x', 'y', 'z'});
    
    List<String> result = new ArrayList<>();
    backtrack("", digits, phoneMap, result);
    return result;
}

public static void backtrack(String combination, String nextDigits, Map<Character, char[]> phoneMap, List<String> result) {
    if (nextDigits.length() == 0) {
        result.add(combination);
    } else {
        char digit = nextDigits.charAt(0);
        char[] letters = phoneMap.get(digit);
        for (char letter : letters) {
            backtrack(combination + letter, nextDigits.substring(1), phoneMap, result);
        }
    }
}


public static List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return result;
    }
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    backtracking(result, digits, "", 0, mapping);
    return result;
}

private static void backtracking(List<String> result, String digits, String curr, int index, String[] mapping) {
    if (index == digits.length()) {
        result.add(curr);
        return;
    }
    String letters = mapping[digits.charAt(index) - '0'];
    for (int i = 0; i < letters.length(); i++) {
        backtracking(result, digits, curr + letters.charAt(i), index + 1, mapping);
    }
}


public List<String> letterCombinations(String digits) {
    List<String> combinations = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
        return combinations;
    }
    Map<Character, char[]> map = new HashMap<>();
    map.put('2', new char[]{'a', 'b', 'c'});
    map.put('3', new char[]{'d', 'e', 'f'});
    map.put('4', new char[]{'g', 'h', 'i'});
    map.put('5', new char[]{'j', 'k', 'l'});
    map.put('6', new char[]{'m', 'n', 'o'});
    map.put('7', new char[]{'p', 'q', 'r', 's'});
    map.put('8', new char[]{'t', 'u', 'v'});
    map.put('9', new char[]{'w', 'x', 'y', 'z'});
    
    StringBuilder sb = new StringBuilder();
    helper(combinations, map, digits, sb, 0);
    return combinations;
}

private void helper(List<String> combinations, Map<Character, char[]> map, String digits, StringBuilder sb, int index) {
    if (sb.length() == digits.length()) {
        combinations.add(sb.toString());
        return;
    }
    char digit = digits.charAt(index);
    char[] chars = map.get(digit);
    for (char c : chars) {
        sb.append(c);
        helper(combinations, map, digits, sb, index + 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}


public List<String> letterCombinations(String digits) {
    LinkedList<String> ans = new LinkedList<String>();
    if(digits.isEmpty()) return ans;
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for(int i =0; i<digits.length();i++){
        int x = Character.getNumericValue(digits.charAt(i));
        while(ans.peek().length()==i){
            String t = ans.remove();
            for(char s : mapping[x].toCharArray())
                ans.add(t+s);
        }
    }
    return ans;
}


public static List<String> letterCombinations(String digits) {
    if (digits.length() == 0) {
        return new ArrayList<>();
    }
    Map<Character, List<Character>> map = new HashMap<>();
    map.put('2', Arrays.asList('a', 'b', 'c'));
    map.put('3', Arrays.asList('d', 'e', 'f'));
    map.put('4', Arrays.asList('g', 'h', 'i'));
    map.put('5', Arrays.asList('j', 'k', 'l'));
    map.put('6', Arrays.asList('m', 'n', 'o'));
    map.put('7', Arrays.asList('p', 'q', 'r', 's'));
    map.put('8', Arrays.asList('t', 'u', 'v'));
    map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    
    List<String> result = new ArrayList<>();
    helper(digits, 0, new StringBuilder(), map, result);
    return result;
}

private static void helper(String digits, int index, StringBuilder sb, Map<Character, List<Character>> map, List<String> result) {
    if (index == digits.length()) {
        result.add(sb.toString());
        return;
    }
    
    char digit = digits.charAt(index);
    List<Character> letters = map.get(digit);
    for (char letter : letters) {
        sb.append(letter);
        helper(digits, index + 1, sb, map, result);
        sb.deleteCharAt(sb.length() - 1);
    }
}
