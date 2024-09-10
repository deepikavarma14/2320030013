package student15que;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestGradedStudent {
	 @Test
	    public void testGrading() {
	        GradedStudent student = new GradedStudent(1, "Alice");
	        Course course = new Course("Math", "M101");
	        student.addCourse(course);
	        student.addGrade(course, "A");

	        assertEquals("A", student.getGrade(course));
	    }
}