public class Main {

    public static void main(String[] args) {
        PrimeNumber primeNumberStack = new PrimeNumber();
        Stack<String> myStack = new Stack<>();
        String[] primeNumbers = primeNumberStack.prime(1000);

        for (int i = 0; i < primeNumbers.length; i++) {
            for (int j = i + 1; j < primeNumbers.length; j++) {
                if (primeNumberStack.anagram(primeNumbers[i], primeNumbers[j])) {
                    myStack.push(primeNumbers[i]);
                    myStack.push(primeNumbers[j]);
                }
            }
        }

        String numbers = myStack.display();
        System.out.println("Anagrams in Reverse Order :");
        for(int i = numbers.length() - 1; i > 0; i--) {
            System.out.print(numbers.charAt(i));
        }
    }
}
