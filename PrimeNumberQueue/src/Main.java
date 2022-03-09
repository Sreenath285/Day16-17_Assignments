public class Main {

    public static void main(String[] args)
    {
        Queue<String> queue = new Queue<String>();
        PrimeNumber primeNumberQueue = new PrimeNumber();
        String[] primeNumbers = primeNumberQueue.prime(1000);

        for (int i = 0; i < primeNumbers.length; i++)
        {
            for (int j = i + 1; j < primeNumbers.length; j++)
            {
                if (primeNumberQueue.anagram(primeNumbers[i], primeNumbers[j]))
                {
                    queue.enqueue(primeNumbers[i]);
                    queue.enqueue(primeNumbers[j]);
                }
            }
        }
        queue.display();
    }
}
