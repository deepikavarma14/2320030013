package student6week;

public class StudentManagementSystem {
	private EnrollmentService enrollmentService;
    public StudentManagementSystem(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }
    public void enrollStudent(Student student, Course course) {
        enrollmentService.enrollStudentInCourse(student, course);
    }
}
