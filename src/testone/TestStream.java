package testone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TestStream {
	
public static final String pattern ="^\\d{16}|\\w{10}$|";

	public static void main(String[] args) {
		
		List<Integer> b = new ArrayList<Integer>();
		List<Integer> bb = new ArrayList<Integer>();
		List<Integer> c = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			b.add(i);
		}
		System.out.println(b);
		b = b.stream()
		     .filter(action -> action > 5 ? true:false)
		     .collect(Collectors.toList());
		
		c.addAll(b);
		int ctosum = c.stream()
					  .filter(action -> (action >5) ? true:false)
					  .mapToInt(action -> {
						  int a=action*2;return a;
					  })					 
					  .sum();
		c.clear();
		System.out.println(c);
		c.addAll(b);
		c.stream()
		 .filter(action -> action >5)
		 .forEach(action -> {
			  bb.add(action*2);
		  });
		System.out.println(b);
		System.out.println(bb);
		System.out.println(ctosum);		

	}
}
