package student6week;

public class EnrollmentServiceImpl implements EnrollmentService{
	public void enrollStudentInCourse(Student student, Course course) {
        student.enrollInCourse(course);
        System.out.println(student.getName() + " enrolled in " + course.getCourseName());
    }
}
