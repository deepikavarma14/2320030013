package models;

public class RegularMember extends Member{
	 public RegularMember(String name, int memberId) {
	        super(name, memberId);
	    }
	 public String getMemberType() {
	        return "Regular Member";
	    }
}
