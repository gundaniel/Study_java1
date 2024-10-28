package exam_collection_set;

public class Member{
	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString(){
		return String.format("member - (name : %s, age : %d) ", name, age);
	}

	
	//Member 클래스의 동일 객체는 age 필드의 값이 같으면 동일 객체
	/*public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.age == member.age)
				return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return age;
	} 
	*/

	//Member 클래스의 동일 객체는 name 필드의 값이 같으면 동일 객체
	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(name.equals(member.name))
				return true;
		}
		return false;
	} 

	@Override
	public int hashCode() {
		return name.hashCode();
	} 
	*/
	
	@Override // name 과 age 모두가 같아야 동일객체
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age) ;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}  
}

