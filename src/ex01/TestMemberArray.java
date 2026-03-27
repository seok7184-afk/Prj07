package ex01;

import java.util.Objects;

class Member {
	//Field
	private int     num;
	private String  name;
	private String  tel;
	
	//Constructor
	public Member() {
		
	}

	public Member(int num, String name, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}
	
	// hashCode
	@Override
	public int hashCode() {
		return Objects.hash(name, num, tel);
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {
		Member other = (Member) obj;
		return Objects.equals(name, other.name) || num == other.num;
	}

	// Method
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
	
}

public class TestMemberArray {

	public static void main(String[] args) {
		// 여러명의 정보를 입력받아
		// 검색 객체를 만들어서 해당 멤버를 찾는다
		/*
		Member  m1  =  new  Member(1, "민지", "010-1234-5678");
		Member  m2  =  new  Member(2, "원영", "010-2345-5678");
		Member  m3  =  new  Member(3, "윈터", "010-3234-5678");
		Member  m4  =  new  Member(4, "유진", ""); //빈문자열
		Member  m5  =  new  Member(5, "유나", "010-5234-5678");
		Member  m6  =  new  Member(6, "닝닝", null); // null
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);
		*/
		
		Member [] mArr  =  new Member[6];
		mArr[0]  =  new Member(1, "민지", "010-1234-5678");
		mArr[1]  =  new  Member(2, "원영", "010-2345-5678");
		mArr[2]  =  new  Member(3, "윈터", "010-3234-5678");
		mArr[3]  =  new  Member(4, "유진", ""); //빈문자열
		mArr[4]  =  new  Member(5, "유나", "010-5234-5678");
		mArr[5]  =  new  Member(6, "닝닝", null); // null
 		
		for (Member member : mArr) {
			System.out.println(member);
		}
		System.out.println("=========================================");
		
		// 찾을 사람의 정보
		Member  mem  =  new Member (3, "원영", null);
		
		// == 주소 비교로는 찾을 수 없다
		boolean found = false;
		for (int i = 0; i < mArr.length; i++) {
			Member member  =  mArr[i];
			if(member.equals(mem)) {
				System.out.println(member);
				found = true;
				break;
			}
		}
		if(!found) {
		    System.out.println("못찾음");
		}

	}

}

