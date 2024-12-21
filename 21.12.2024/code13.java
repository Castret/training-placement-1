public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "Leap Year" : "Not Leap Year");
    }
}
