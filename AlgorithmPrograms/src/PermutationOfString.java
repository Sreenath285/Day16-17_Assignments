import java.util.ArrayList;
import java.util.Scanner;

public class PermutationOfString {

    public static void iterativePermutation(String word) {

        if (word == null || word.length() == 0)
            return;
        ArrayList<String> iterativeArrayList = new ArrayList<>();
        iterativeArrayList.add(String.valueOf(word.charAt(0)));

        for (int index = 1; index < word.length(); index++) {
            for (int index2 = iterativeArrayList.size() - 1; index2 >= 0; index2--) {
                String currentPermutation = iterativeArrayList.remove(index2);
                for (int index3 = 0; index3 <= currentPermutation.length(); index3++) {
                    iterativeArrayList.add(currentPermutation.substring(0, index3) + word.charAt(index)
                            + currentPermutation.substring(index3));
                }
            }
        }
        System.out.println(iterativeArrayList);
    }

    public static void recursivePermutation(String word, String permuteWord) {

        if (word.length() == 0) {
            System.out.print(permuteWord + " ");
            return;
        }
        for (int index = 0; index < word.length(); index++) {
            char iChar = word.charAt(index);
            String restOfString = word.substring(0, index) + word.substring(index + 1);
            recursivePermutation(restOfString, permuteWord + iChar);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String word = sc.next();
        sc.close();

        System.out.println("Iterative permutation : ");
        iterativePermutation(word);

        System.out.println("Recursive permutation : ");
        recursivePermutation(word, "");

    }

}
