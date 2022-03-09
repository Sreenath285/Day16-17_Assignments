import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String firstStr = sc.nextLine();
        System.out.println("Enter second string : ");
        String secondStr = sc.nextLine();
        sc.close();

        int lengthOfFirstStr = firstStr.length();
        int lengthOdSecondStr = secondStr.length();

        if (lengthOfFirstStr == lengthOdSecondStr) {
            char[] firstCharArr = firstStr.toCharArray();
            Arrays.sort(firstCharArr);

            char[] secondCharArray = secondStr.toCharArray();
            Arrays.sort(secondCharArray);

            if (Arrays.equals(firstCharArr, secondCharArray)) {
                System.out.println("The two strings are anagram");
            }
            else {
                System.out.println("The two strings are not anagram");
            }
        } else {
            System.out.println("Two strings are not of same length");
        }
    }
}
