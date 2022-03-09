public class PrimeAnagramPalindrome {

    public static void main(String[] args) {

        primeNumbers(1000);
    }

    public static void primeNumbers(int last) {

        int i;
        int temp = 0;
        for (i = 2; i <= last; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                palindrome(i);
            }
            else {
                temp = 0;
            }
        }
    }

    public static void palindrome(int temp) {

        int num, remainder, reverseNum = 0;
        num = temp;
        while (temp != 0) {
            remainder = temp % 10;
            reverseNum = reverseNum * 10 + remainder;
            temp = temp / 10;
        }
        if (num == reverseNum) {
            System.out.print(num + " ");
        }
    }
}
