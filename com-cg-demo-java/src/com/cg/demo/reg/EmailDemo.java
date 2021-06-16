package com.cg.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDemo {
public static void main(String[] args) {
	String email="venukanni38448@gmail.com";
	String regEx="[\\D][\\w]+[@][\\D][a-zA-Z]+[\\.][a-zA-Z]+";
	Pattern pattern=Pattern.compile(regEx);
	Matcher matcher=pattern.matcher(email);
	System.out.println(matcher.matches());
}
}
