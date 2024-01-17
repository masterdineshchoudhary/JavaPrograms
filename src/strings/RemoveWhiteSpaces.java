package strings;

// package Remove space from String;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "I love Java";

        // mtd 1 : using builtin method
        //String strWithoutSpace = str.replaceAll("\\s", "");
        //System.out.println(strWithoutSpace);

        // mtd 2: without using builtin method
        char[] strarr = str.toCharArray();
        String strWithoutSpace = "";
        for (int i = 0; i < strarr.length; i++) {
            if ((strarr[i]!=' ') && (strarr[i]!='\t')) {
                strWithoutSpace += strarr[i];
            }
        }
        System.out.println(strWithoutSpace);

    }
}
