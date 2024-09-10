package student15que;
import java.util.HashMap;
import java.util.Map;
public class StudentManagement implements IStudentManagement{
	private Map<Integer, Student> students = new HashMap<>();

    @Override
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Student getStudentById(int id) {
        return students.get(id);
    }
}
