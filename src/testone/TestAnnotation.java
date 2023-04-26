package testone;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestAnnotation {

	@AAA(age = 0, name = "")
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");list.add("2");list.add("3");
		
		System.out.println(list.stream()
				               .filter(predicate -> !predicate.equals("2"))
				               .collect(Collectors.toList())
				               
						  );
		

	}
	public @interface AAA{
		String   value() default "777";
	    String   name();
	    int      age();
	    String[] newNames() default {"1","2"};
	}

}
