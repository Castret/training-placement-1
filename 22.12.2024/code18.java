import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n - 1];
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
            arrSum += arr[i];
        }
        System.out.println(totalSum - arrSum);
    }
}
