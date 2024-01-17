package strings;

// Java Program To Reverse A String

public class ReverseString {

    // mtd 3 : method
    static String recMtd(String str) {
        if ((null==str) || (str.length()<=1)) {
            return str;
        }
        return recMtd(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
/* 
        // mtd 1 : using StringBuffer class (we use reverse() method of StringBuffer class to reverse the string)
        StringBuffer sbf = new StringBuffer("Dinesh");
        System.out.println(sbf.reverse());
*/
/* 
        // mtd 2 : using iterative method (In this method, first we convert given string to char array using charArray() method. And then we iterate that array in the reverse order.)
        String str = "Khushwant";
        char[] strarr = str.toCharArray();
        for(int i=strarr.length-1 ; i>=0 ; i--) {
            System.out.print(strarr[i]);
        }
        
        System.out.println();
        String st = "Dinesh";
        String revst = "";
        for (int i=st.length()-1;i>=0;i--){
            revst =revst+ st.charAt(i);
        }
        System.out.println(revst);
        
*/
        // mtd 3 : using recursive method (Here is the method which reverses the string by calling itself recursively.)
        String str = "java";
        System.out.println(recMtd(str));
        
    }
}