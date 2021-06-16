package com.cg.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		String regEx="[a-zA-Z0-9]";
		Pattern pattern=Pattern.compile(regEx);
		for(int i=0;i<265;i++) {
			String input = Character.toString((char)i);
			Matcher matcher=pattern.matcher(input);
			System.out.println(i+" - "+input+" - "+matcher.matches() );
		}
		
		
	}
}
