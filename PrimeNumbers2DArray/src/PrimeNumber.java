public class PrimeNumber {

    public void prime2DArray() {
        int array[][]=new int[10][100];
        int prime[][]=new int[10][100];
        int temp=1;
        for (int i = 0; i< 10; i++) {
            for (int j = 0; j < 100; j++) {
                array[i][j]=temp;
                temp++;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                if(checkPrime(array[i][j]))
                {
                    prime[i][j]=array[i][j];
                }
                else
                {
                    prime[i][j]=-1;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 100; j++) {
                if(prime[i][j]!=-1)
                {
                    System.out.print(prime[i][j]+" ");
                }
            }
            System.out.println("\n");
        }
    }

    public boolean checkPrime(int number)
    {
        int count = 0;
        for (int i = 2; i <= number - 1; i++) {
            if(number % i == 0)
            {
                count++;
            }
        }
        if(count==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
