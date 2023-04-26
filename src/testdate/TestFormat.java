package testdate;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TestFormat {
	
	public final static String DefaultDatePattern = "yyyy-MM-dd";

	public static void main(String[] args) {
		String date = "19960616";
		
		System.out.printf("%tF%n", date);

	}
	
	public static String getDateFormat(String date) {
		DateFormat df = DateFormat.getDateInstance();
		
		
		return null;
	}
	
	public static LocalDate getDateTime(String date, String pattern) {
        try {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
        } catch (DateTimeParseException e) {
            return null;
        }
    }

}
