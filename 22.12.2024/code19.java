import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), original = num, reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        if (original == reversed) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
