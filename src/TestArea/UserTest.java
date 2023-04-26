package TestArea;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserTest {

	public static void main(String[] args) {
		user u1 = new user("A","B","C","D","E");
		user u2 = new user("A","B","C","D","E");
		user u3 = new user("1","2","3","4","5");
		user u4 = new user("B","E","E","F","D");
		user u5 = new user("7","8","9","10","11");
		
		List<user> list = new ArrayList<user>();
		list.add(u1);list.add(u2);list.add(u3);list.add(u4);list.add(u5);
		
		System.out.println(list.stream()
				               .distinct()
				               .collect(Collectors.toList()));
		
	}

}
