package com.bridgelabz.program;

import java.util.regex.Pattern;

public class regex {

	public static void main(String args[]) {
		String regexName="[a-zA-Z0-9\\s]{4,}";
		String regexPhoneNumber = "[0-9]";
		String name="raginipatil";
		
		System.out.println(name);
		
		if (name == null || name == "" || Pattern.matches(regexName, name)==false) {
			System.out.println("in if =="+Pattern.matches(regexName, name));
		}
		
		
	}

}
