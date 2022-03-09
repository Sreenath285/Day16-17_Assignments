import java.util.Deque;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Dequeue<Character> d = new Dequeue<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word = sc.nextLine();
        char charArr[] = word.toCharArray();
        String str = "";
        for (int i = 0; i < charArr.length; i++) {
            d.addFront(charArr[i]);
        }
        for (int i = 0; i < charArr.length; i++) {
            str += d.removeFront();
        }
        if (word.equals(str)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
