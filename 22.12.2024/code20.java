public class TowersOfHanoi {
    public static void moveDisks(int n, char source, char auxiliary, char target) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }
        moveDisks(n - 1, source, target, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        moveDisks(n - 1, auxiliary, source, target);
    }
    public static void main(String[] args) {
        int n = 3;
        moveDisks(n, 'A', 'B', 'C');
    }
}
