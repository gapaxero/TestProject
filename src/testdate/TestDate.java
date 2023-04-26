package testdate;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		String date = "2022/09/26 11:08:09";
		long time = 10;
		
		System.out.println(getDateTime(date, TimeType.Minute, time));
		
	}
	
	public static LocalDateTime getDateTime(String date,long time) throws ParseException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
		return dateTime.plusSeconds(time);
	}
	
	public static LocalDateTime getDateTime(String date, TimeType type, long time) throws ParseException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
		
		switch (type) {
		case Houer:
			return dateTime.plusHours(time);
		case Minute:
			return dateTime.plusMinutes(time);
		case Second:
			return dateTime.plusSeconds(time);
		default:
			return dateTime;
		}

//		return dateTime;
	}
	
}

enum TimeType {
	Houer, Minute, Second
}
