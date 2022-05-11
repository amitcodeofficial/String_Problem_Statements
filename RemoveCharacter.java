package com.bridgelab.TaskDay1;

public class RemoveCharacter {

//	Method which removes the characters of first string which exists in second string and gives the output
	public static void removeChar(String first, String second) {
		String newString = "";

		for(int i=0;i<first.length();i++) {
			int counter=0;
			for(int j=0;j<second.length();j++) {
				if(first.charAt(i)==second.charAt(j)) {
					counter++;
				}
			}
			if(counter<1) {
				newString+=first.charAt(i);
			}
		}
		System.out.println(newString);
	}

	public static void main(String[] args) {
		String first = "india is great";
		String second = "in";
		
		removeChar(first, second);
	}

}
