package oo.member;

public class PhoneMember extends Member{

	String phone;
	boolean verified = false;
	
	public PhoneMember() {
		super();
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isVerified() {   //boolean的get規定用is	
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}

}
