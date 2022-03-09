import java.util.Scanner;

public class BankingCashCounter {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner counter = new Scanner(System.in);
        System.out.print("Enter the number of persons : ");
        int per = counter.nextInt();

        boolean result = checkNumber(per);
        if (result) {
            int cash = 99999999;
            // to put every person in a queue
            for (int i = 0; i < per; i++) {
                queue.enqueue(i);
            }
            while (per != 0) {
                System.out.println("Available amount :  " + cash);
                int count = 0, option = 0;

                while (count == 0) {
                    System.out.println("1: Withdraw \n2: Deposit");
                    System.out.print("Enter choice : ");
                    option = counter.nextInt();

                    switch (option) {
                        case 1:
                            System.out.print("Enter the amount to withdraw : ");
                            int withdrawAmount = counter.nextInt();
                            System.out.println("Amount withdrawn successfully");
                            queue.dequeue();
                            cash = cash - withdrawAmount;
                            count += 1;
                            System.out.println("Remaining balance : " + cash);
                            per--;
                            break;

                        case 2:
                            System.out.print("Enter the required amount to deposit : ");
                            int depositAmount = counter.nextInt();
                            System.out.println("Amount deposited successfully");
                            queue.dequeue();
                            cash = cash + depositAmount;
                            count += 1;
                            System.out.println("Remaining balance : " + cash);
                            per--;
                            break;

                        default:
                            System.out.println("Invalid input");
                    }
                }
            }
        } else {
            System.out.println("Invalid input");
        }

        counter.close();
    }

    public static boolean checkNumber(int person) {
        return person >= 0 || person <= 9;
    }
}
