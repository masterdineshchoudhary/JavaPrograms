package strings;

public class NoOfWordInString {
  public static void main(String[] args) {
    String s = "Sharma is a good player and he is so punctual";
    String words[] = s.split(" ");
    System.out.println("The Number of words present in the string are : "+words.length);
  }
}