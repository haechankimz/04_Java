package edu.kh.oop.constructor;

public class MemberRun {
	
	public static void main(String[] args) {
		
		// 회원 객체 생성
		// -> 기본 생성자를 이용해서 생성
		Member member1 = new Member();
		
		// null == "참조하는 객체가 없다"를 나타내는 값
		// 				 (저장된 주소가 없다)
		member1.inform();
		
		
		//member1이 참조하는 Member객체의 필드값을 세팅
		member1.setMemberId("member01");
		member1.setMemberPw("pass01");
		member1.setMemberName("김회원");
		member1.setMemberAge(27);
		
		// 새로운 Member객체 생성 후 필드 값 세팅
		Member member2 = new Member(); // 기본 생성자
		
		member2.setMemberId("qwerasdf");
		member2.setMemberPw("1234");
		member2.setMemberName("김해찬");
		member2.setMemberAge(22);
		
		
		System.out.println("[member1]");
		member1.inform();
		
		System.out.println("[member2]");
		member2.inform();
		
		
		// -------------------------------------
		// 매개 변수 생성자를 이용해서 Member 객체 생성
		// -> 코드 길이 감소
		Member member3= new Member("dkssud", "12334", "해치", 29);
		System.out.println("[member3]");
		member3.inform();
		
		
		// ** 프로그래밍 언어에서 변수명, 함수명, 메서드명 중복 허용 X **
		
		// 변수명 중복
		int a= 10;
//		int a= 20;
		
	}
	
	// 메서드명 중복
	public void test() {}
//	public void test() {}
	
	
}
