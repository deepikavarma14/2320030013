package student6week;
import java.util.ArrayList;
import java.util.List;
public abstract class Student {
	protected String name;
    protected int id;
    protected List<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        this.courses.add(course);
        course.addStudent(this);
    }

    public abstract String getStudentType();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
