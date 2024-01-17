package strings;

import java.util.HashMap;

class CharOccCount {
    private static void charCount(String inputstr){
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] strArr = inputstr.toCharArray();
        for (char c : strArr) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c)+1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println(inputstr+" "+charCountMap); 
    }
    public static void main(String[] args) {
        charCount("Java J2EE Java JSP J2EE");
    }
}
