package com.bridgelab.TaskDay1;

import java.util.ArrayList;
import java.util.ListIterator;

public class PrintDuplicate {

	//	Method which searches the duplicate values from given string input and gives the duplicate values
	public static void printDuplicate(String input) {
		ListIterator list = null;

		ArrayList<Character> charList = new ArrayList<Character>();
		for(int i=0;i<input.length();i++) {
			char temp=input.charAt(i);
			int counter=0;
			for(int j=0;j<input.length();j++) {
				if(temp == input.charAt(j)) {
					counter++;
				}
			}
			if(counter>=2) {
				if(charList.size()==0) {
					charList.add(temp);
				}else{
					int counter2=0;
					for(int k=0;k<charList.size();k++) {
						if(charList.get(k).equals(temp)) {
							counter2++;
						}
					}
					if(counter2>=1 || temp==' ') {
					}else {
						charList.add(temp);
					}
				}
			}
		}

		list = charList.listIterator();
		while(list.hasNext()) {
			System.out.print(list.next());
			if(list.hasNext()==true) {
				System.out.print(", ");
			}
		}
	}

	public static void main(String[] args) {
		String input = "Java and JavaScript";

		printDuplicate(input);
	}

}
