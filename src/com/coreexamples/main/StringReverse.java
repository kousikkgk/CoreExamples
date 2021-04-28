package com.coreexamples.main;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Automation";
		
		System.out.println(strMethod(str));
		strWithoutMethod(str);
		
	}

	private static String strMethod(String str) {
		StringBuilder builder = new StringBuilder();
		builder.append(str);
		builder = builder.reverse();
		return builder.toString();
	}

	private static void strWithoutMethod(String str) {
		char chars[] = str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
	}

}
