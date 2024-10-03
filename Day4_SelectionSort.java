public class Day4_SelectionSort {
    public static void selectionSort (int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void print (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 4, 3, 1};
        System.out.println("Original array: ");
        print(arr);
        System.out.println("\nSorted array: ");
        selectionSort(arr);
        print(arr);
    }
}
