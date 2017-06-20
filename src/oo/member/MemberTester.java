package oo.member;

public class MemberTester {

	public static void main(String[] args){
		
	Member member = new Member("Eric");
	member.setAge(5);
	System.out.println(member.getAge());
	
	//Phone Member
	PhoneMember member2 = new PhoneMember();
	member2.setAge(-5);
	member2.setPhone("0912345678");
	member2.setVerified(true);
	System.out.println(member2.getAge());
	System.out.println(member2.getPhone());
	System.out.println(member2.isVerified());
	}
}
