import java.util.Scanner;

public class InsertionSort {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int num = sc.nextInt();

        String[] strings = new String[num];
        int i = 0;
        while (i < num){
            System.out.print("Element " + (i + 1) + " : ");
            strings[i] = sc.next();
            i++;
        }

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(strings);

        printArray(strings);
        sc.close();
    }

    /***
     * Function to sort array using insertion sort
     * @param arr - array of strings
     */
    void sort(String arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i){
            String key = arr[i];
            int j = i-1;

            // moving element one position ahead
            while (j >= 0 && arr[j].compareTo(key) > 0){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    /***
     * printArray method created to print size of array
     * @param arr - array of strings
     */
    static void printArray(String arr[]){

        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
