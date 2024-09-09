package student6week;

public class Main {
	public static void main(String[] args) {
        Course course1 = new Course("CS101", "Introduction to Computer Science");
        Course course2 = new Course("ENG201", "English Literature");

        Student student1 = new UndergraduateStudent("Alice", 1);
        Student student2 = new GraduateStudent("Bob", 2);

        EnrollmentService enrollmentService = new EnrollmentServiceImpl();
        StudentManagementSystem sms = new StudentManagementSystem(enrollmentService);

        sms.enrollStudent(student1, course1);
        sms.enrollStudent(student2, course2);

        System.out.println("Course: " + course1.getCourseName() + " has students: " + course1.getStudents().size());
        System.out.println("Course: " + course2.getCourseName() + " has students: " + course2.getStudents().size());
    }
}
