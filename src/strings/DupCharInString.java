package strings;

import java.util.HashMap;
import java.util.Set;

// Find duplicate chars and their count in given string
/*
 * LOGIC:
 * We use HashMap and Set to find the duplicate characters in a string. 
 * First, we convert the given string to char array. 
 * We then create one HashMap with Character as a key and it’s number of occurrences as a value. 
 * Then we extract a Set containing all keys of this HashMap using keySet() method. 
 * Then we use this keySet to get the duplicate characters i.e characters which have appeared more than once in the given string.
 * */
public class DupCharInString {

    static void DupCharCount(String inputString) {
    	// Creating a HashMap containing char as key and it's occurrences as value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
            	// If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c)+1);
            } else {
            	// If char is not present in charCountMap, putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        // Getting a Set containing all keys of charCountMap
        Set<Character> charsInString = charCountMap.keySet();
        System.out.println("Duplicate Characters In "+inputString);
        for(Character ch: charsInString) {
            if(charCountMap.get(ch)>1) {
            	// //If any char has a count of more than 1, printing it's count
                System.out.println(ch+" "+charCountMap.get(ch));
            }
        }
    }
    public static void main(String[] args) {
        DupCharCount("JavaJ2EE");
        DupCharCount("Fresh Fish");
        DupCharCount("Better Butter");
    }
    
}