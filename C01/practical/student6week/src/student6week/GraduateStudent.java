package student6week;

public class GraduateStudent extends Student{
	public GraduateStudent(String name, int id) {
        super(name, id);
    }
    public String getStudentType() {
        return "Graduate Student";
    }
}
