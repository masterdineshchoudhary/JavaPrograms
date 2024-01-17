import java.util.HashMap;
import java.util.Map;

public class GetUniqueLetter {
    public static void main(String[] args) {
        System.out.println(getUniqueLetter("hackthegame"));
    }
    public static int getUniqueLetter(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        char u = s.charAt(0);
        boolean found = false;
        for(Map.Entry<Character, Integer> e: h.entrySet()) {
            if (e.getValue()==1) {
                found = true;
                u = e.getKey();
                break;
            }
        }
        if (found)
            return s.indexOf(u)+1;
        else
            return -1;
    }
}