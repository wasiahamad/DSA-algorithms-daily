/**
 * Day7_MergeSort
 */
public class Day7_MergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);// left part
        mergeSort(arr, mid + 1, ei); // right part
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        // righht part
        while (j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        // copy temp to original array
        for (k = 0; k < temp.length; k++) {
            arr[k + si] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}