package student15que;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestStudent {
	@Test
    public void testStudentCreation() {
        Student student = new Student(1, "Alice");
        assertEquals(1, student.getId());
        assertEquals("Alice", student.getName());
    }
    
    @Test
    public void testAddCourse() {
        Student student = new Student(1, "Alice");
        Course course = new Course("Math", "M101");
        student.addCourse(course);
        assertEquals(1, student.getCourses().size());
    }
}
