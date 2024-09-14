package surce;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class StudentGrades {
	private Map<Integer, Set<Integer>> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }
    public void addGrade(int studentId, int grade) {
        studentGrades.putIfAbsent(studentId, new HashSet<>());
        studentGrades.get(studentId).add(grade);
        System.out.println("Added grade " + grade + " for student with ID: " + studentId);
    }
    public Set<Integer> getGrades(int studentId) {
        return studentGrades.getOrDefault(studentId, new HashSet<>());
    }
    public void listAllStudents() {
        if (studentGrades.isEmpty()) {
            System.out.println("No student data available.");
        } 
        else {
            for (Map.Entry<Integer, Set<Integer>> entry : studentGrades.entrySet()) {
                System.out.println("Student ID: " + entry.getKey() + ", Grades: " + entry.getValue());
            }
        }
    }
    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();
        grades.addGrade(101, 85);
        grades.addGrade(101, 90);
        grades.addGrade(102, 78);
        grades.addGrade(103, 88);
        System.out.println("Grades for student 101: " + grades.getGrades(101));
        grades.listAllStudents();
    }	
}
