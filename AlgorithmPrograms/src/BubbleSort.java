import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[])
    {
        BubbleSort bubbleSort = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        bubbleSort.bubbleSort(arr);

        System.out.print("Sorted array : ");
        bubbleSort.printArray(arr);
    }

    void bubbleSort(int arr[])
    {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
