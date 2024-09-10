package student15que;
import java.util.HashMap;
import java.util.Map;
public class CourseManagement implements ICourseManagement{
	private Map<String, Course> courses = new HashMap<>();
    public void addCourse(Course course) {
        courses.put(course.getCode(), course);
    }
    public Course getCourseByCode(String code) {
        return courses.get(code);
    }
}
