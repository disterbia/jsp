package models;

public class Member {

	private String name = "홍길동";
	private String addr= "부산진구";
	
	public Member() {
		
	}

	public Member(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
