import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word1: ");
        String word1 = sc.next();
        System.out.println("Enter word2: ");
        String word2 = sc.next();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
