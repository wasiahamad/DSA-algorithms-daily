package Sorting_Algorithms;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for (int step = 0; step < arr.length; step++) {
            for (int i = 0; i < arr.length - step - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22,};
        bubbleSort(arr);
    }
}
