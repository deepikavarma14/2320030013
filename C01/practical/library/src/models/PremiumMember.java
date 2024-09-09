package models;

public class PremiumMember extends Member{
	public PremiumMember(String name, int memberId) {
        super(name, memberId);
    }

    public String getMemberType() {
        return "Premium Member";
    }
}
