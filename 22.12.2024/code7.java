import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int key = scanner.nextInt();
        int result = binarySearch(arr, key);
        if (result == -1) System.out.println("Not Found");
        else System.out.println("Found at index " + result);
    }
}