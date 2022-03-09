import java.util.Scanner;

public class FindNumber {

    public static Scanner sc = new Scanner(System.in);

    public void findNumber(int low, int high) {

        if(low == high) {
            System.out.println("Number is : "+low);
            System.out.println("Intermediary Number is: "+(low-1)+" and "+(low+1));
            return;
        }

        int middle = (low+high)/2;
        int choice;
        System.out.println("Press 1 if the number is between : "+low+" and "+middle);
        System.out.println("Press 2 if the number is between : "+(middle+1)+" and "+high);
        choice = sc.nextInt();

        if(choice == 1) {
            findNumber(low, middle);
        }
        else {
            findNumber(middle+1, high);
        }
    }

    public static void main(String[] args) {

        FindNumber findNumber = new FindNumber();
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        findNumber.findNumber(0, num);
        sc.close();

    }
}
