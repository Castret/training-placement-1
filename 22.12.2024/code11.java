import java.util.Scanner;
import java.util.Arrays;
public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine(), str2 = scanner.nextLine();
        if (isAnagram(str1, str2)) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}
