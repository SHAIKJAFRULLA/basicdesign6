import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {
    private ArrayList<Student> students; //gradetracer

    public GradeTracker() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, int id) {
        students.add(new Student(name, id));
    }

    public void addGrade(int id, int grade) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.addGrade(grade);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        GradeTracker tracker = new GradeTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nGrade Tracker Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Display Students");
            System.out.println("4. Find Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    tracker.addStudent(name, id);
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    id = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    tracker.addGrade(id, grade);
                    break;
                case 3:
                    tracker.displayStudents();
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    id = scanner.nextInt();
                    tracker.findStudent(id);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
