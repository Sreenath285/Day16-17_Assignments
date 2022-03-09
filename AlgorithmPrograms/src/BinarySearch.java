import java.util.Scanner;

public class BinarySearch {

    public static void main(String []args){

        String[] arr = { "one", "two", "three", "four", "five"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word : ");
        String word = sc.nextLine();
        int result = binarySearch(arr, word);

        if (result == -1)
            System.out.println("Word not present");
        else
            System.out.println("Word is at " + "position : " + (result + 1));

        sc.close();
    }

    /*
     returns index of x if it is present in arr[],
     else return -1
    */
    static int binarySearch(String[] arr, String x){
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            int res = x.compareTo(arr[middle]);

			/*
             check if x is present at middle
             */
            if (res == 0)
                return middle;

			/*
            if x greater, ignore left half
            */
            if (res > 0)
                left = middle + 1;

			/*
            if x is smaller, ignore right half
			*/
            else
                right = middle - 1;
        }

        return -1;
    }
}
