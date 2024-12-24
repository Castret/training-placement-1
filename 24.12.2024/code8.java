public class Student {
    String name;
    int rollNumber;
    double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name + " Roll Number: " + rollNumber + " Marks: " + marks);
    }

    public static void main(String[] args) {
        Student student = new Student("John", 101, 90.5);
        student.display();
    }
}
