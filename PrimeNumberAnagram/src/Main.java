public class Main {

    public static void main(String[] args) {

        PrimeNumberAnagram primeNumberAnagram = new PrimeNumberAnagram();
        String[] primeNumbers = primeNumberAnagram.prime(1000);

        System.out.println("Anagram and prime numbers : ");
        for(int i = 0; i < primeNumbers.length; i++) {
            for(int j = i + 1; j < primeNumbers.length; j++) {
                if(primeNumberAnagram.anagram(primeNumbers[i], primeNumbers[j])) {
                    System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
                }
            }
        }
    }
}
