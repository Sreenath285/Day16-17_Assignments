public class PrimeNumbers {

    public static void main(String[] args) {

        int first = 0, last = 1000;
        int temp = 0;
        for (int i = 2; i <= last; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.print(i + " ");
            }
            else {
                temp = 0;
            }
        }
    }
}
