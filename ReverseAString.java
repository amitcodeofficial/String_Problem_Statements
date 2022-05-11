package com.bridgelab.TaskDay1;

public class ReverseAString {

//	Method which reverses the given string input
	public static void reverseString(String input) {
		String reverse = "";

		for(int i=0;i<input.length();i++) {
			reverse = input.charAt(i)+reverse;
		}

		System.out.println(reverse);
	}

	public static void main(String[] args) {
		String input = "abcd";
		
		System.out.println("Input - "+input);
		
		System.out.print("Reverse - ");
		reverseString(input);
	}

}
