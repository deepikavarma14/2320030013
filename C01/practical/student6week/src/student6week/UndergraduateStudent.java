package student6week;

public class UndergraduateStudent extends Student{
	public UndergraduateStudent(String name, int id) {
        super(name, id);
    }
    public String getStudentType() {
        return "Undergraduate Student";
    }
}
