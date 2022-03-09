public class MergeSort {

    public static void main(String args[]){

        String arr[] = { "Sreekanth", "Sreevidya", "Sreenath", "Sreejesh", "Sreepad"};

        System.out.println("Before sorting : ");
        printArray(arr);

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);

        System.out.println("After sorting : ");
        printArray(arr);
    }


    void mergeArr(String arr[], int left, int middle, int right){
        int sizeLeft = middle - left + 1;
        int sizeRight = right - middle;

        String leftArr[] = new String[sizeLeft];
        String rightArr[] = new String[sizeRight];

        for (int i = 0; i < sizeLeft; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < sizeRight; ++j)
            rightArr[j] = arr[middle + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < sizeLeft && j < sizeRight) {
            if (leftArr[i].compareTo(rightArr[j]) < 0) {
                arr[k] = leftArr[i];
                i++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < sizeLeft) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < sizeRight) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    void sort(String arr[], int left, int right){

        if (left < right) {
            int middle = left + (right - left)/2;
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
            mergeArr(arr, left, middle, right);
        }
    }

    static void printArray(String arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
