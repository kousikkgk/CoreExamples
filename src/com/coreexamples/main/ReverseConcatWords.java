package com.coreexamples.main;

public class ReverseConcatWords {

	public static void main(String[] args) {
		System.out.println(revString("Kousik Daniel"));
	}
	public static String revString(String name) {
		String conName = null;
		StringBuilder conBuilder = new StringBuilder();
		String[] splitStr = name.split(" ");
		for(String str:splitStr) {
			StringBuilder builder = new StringBuilder(str.toLowerCase());
			conBuilder.append((builder.reverse()+" "));
		}
		conName = conBuilder.toString();
		return conName;
	}
}
