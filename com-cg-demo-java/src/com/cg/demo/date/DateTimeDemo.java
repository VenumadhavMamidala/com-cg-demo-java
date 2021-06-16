package com.cg.demo.date;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
public static void main(String[] args) {
//	LocalDate date=LocalDate.now();
//	System.out.println(date.toString());
	LocalDate date=LocalDate.now();
	System.out.println(date.toString());
	
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("mm-dd-yyyy");
	LocalDate myDate=LocalDate.parse("08-15-1947",formatter);
	System.out.println(myDate.toString());
	System.out.println(myDate.format(formatter));
}
}
