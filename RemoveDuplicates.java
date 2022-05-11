package com.bridgelab.TaskDay1;

public class RemoveDuplicates {
	
//	Method which removes the duplicate values and gives the remaining string 
	public static void removeDuplicate(String input) {
		for(int i=0;i<input.length();i++) {
			char temp = input.charAt(i);
			int value=0;
			for(int j=0;j<input.length();j++) {
				if(input.charAt(j)==temp) {
					value++;
				}
			}
			if(value<2) {
				System.out.print(temp);
			}
		}
	}

	public static void main(String[] args) {
		String input="Java";

		removeDuplicate(input);
	}

}
