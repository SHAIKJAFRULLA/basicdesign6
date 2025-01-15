import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private ArrayList<Integer> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName() { //student adding
        return name;
    }

    public int getId() {
        return id;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double calculateAverage() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.size();
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Average Grade: " + calculateAverage();
    }
}
