public class Power {
    public static void main(String[] args) {
        int base = 2, exp = 3, result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        System.out.println(result);
    }
}
