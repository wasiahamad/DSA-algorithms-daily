/**
 * Day1_LinearSearch
 */
public class Day1_LinearSearch {
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 9, 6, 7};
        int target = 8;
        int result = linearSearch(arr, target);
        System.out.println(result);
    }
}