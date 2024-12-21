public class Prime {
    public static void main(String[] args) {
        int num = 7, i;
        boolean isPrime = true;
        for (i = 2; i <= num / 2; i++)
            if (num % i == 0) isPrime = false;
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
