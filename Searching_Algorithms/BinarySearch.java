package Searching_Algorithms;

public class BinarySearch {
    public static int BinarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        int target = 3;
        int result = BinarySearch(arr, target);
        System.out.println("Index of " + target + " is " + result);
    }
}
