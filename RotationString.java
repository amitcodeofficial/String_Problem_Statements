package com.bridgelab.TaskDay1;

public class RotationString {
	
//	Method in which we provide two parameters and check whether first string is equal to reverse order of another by rotating first String
	public static Boolean rotateAndCheck(String first, String second) {
		String reverse = "";
		
		for(int i=0;i<first.length();i++) {
			reverse = first.charAt(i)+reverse;
		}
		
		if(reverse.equals(second)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		String first = "XYZ";
		String second = "ZYX";
		String third = "YXZ";
		
		System.out.println(rotateAndCheck(first, second));
		System.out.println(rotateAndCheck(first, third));
	}

}
