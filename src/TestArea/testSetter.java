package TestArea;

import lombok.Data;

public class testSetter {

	public static void main(String[] args) {
		name n = new name();
		n.setName("BBB");
		setTest(n, n.getName());
		System.out.println(n.toString());
		
		n.setName("AAA");
		setTest(n, n.getName());		
		System.out.println(n.toString());
		
		
	}
	
	public static void setTest(name n,String name) {
		if(name.equals("AAA")) {
			n.setAge("88888888");
			n.setAdd("777777777777");
		}
	}

}

@Data
class name {
	private String name;
	
	private String age = "";
	
	private String add = "";
	
}
