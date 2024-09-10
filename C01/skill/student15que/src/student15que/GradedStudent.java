package student15que;
import java.util.HashMap;
import java.util.Map;

public class GradedStudent extends Student {
	private Map<Course, String> grades = new HashMap<>();

    public GradedStudent(int id, String name) {
        super(id, name);
    }

    public void addGrade(Course course, String grade) {
        grades.put(course, grade);
    }

    public String getGrade(Course course) {
        return grades.get(course);
    }
}
