package TestArea;

import lombok.ToString;

public class user {
public String user1;
public String user2;
public String user3;
public String superUser1;
public String superUser2;
	
	public user() {}

	public user(String user1, String user2, String user3, String superUser1, String superUser2) {
		super();
		this.user1 = user1;
		this.user2 = user2;
		this.user3 = user3;
		this.superUser1 = superUser1;
		this.superUser2 = superUser2;
	}

	public String getUser1() {
		return user1;
	}

	public void setUser1(String user1) {
		this.user1 = user1;
	}

	public String getUser2() {
		return user2;
	}

	public void setUser2(String user2) {
		this.user2 = user2;
	}

	public String getUser3() {
		return user3;
	}

	public void setUser3(String user3) {
		this.user3 = user3;
	}

	public String getSuperUser1() {
		return superUser1;
	}

	public void setSuperUser1(String superUser1) {
		this.superUser1 = superUser1;
	}

	public String getSuperUser2() {
		return superUser2;
	}

	public void setSuperUser2(String superUser2) {
		this.superUser2 = superUser2;
	}
	
	@Override
	public String toString() {
		return "user1:" + user1 + " user2:" + user2 + " user3:" + user3
			   + " superUser1:" + superUser1 + " superUser2:" + superUser2;
	}
	
}
