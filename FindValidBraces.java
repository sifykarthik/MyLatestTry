package TestMain;

import java.util.Stack;

public class FindValidBraces {

	public static void main(String[] args) {
	
		//String input = "[]()({[[]})";
		//String input = "[](){[()]}}";
		//String input = "[]()";
		//String input = "[](){}{}{]";
		String input = "[]()({[[]})";
		
		System.out.println("GIVEN INPUT: " +input);
		
		Stack<Character> stac = new Stack<Character>();
		char[] inputChar = input.toCharArray();
		
		for(int i=0;i<input.length();i++) {
		
			if(inputChar[i]=='[' || inputChar[i]=='(' || inputChar[i]=='{') {
				//System.out.println("inputChar[i]: "+inputChar[i]);
				stac.push(inputChar[i]);
			}
			else if(inputChar[i]==']' || inputChar[i]==')' || inputChar[i]=='}') {
				if(!stac.empty()) {
				
					if(inputChar[i]==']'){ 
						if(stac.peek()=='[') {
							stac.pop();
						}else {
							//System.out.println("THIS GIVEN SEQUENCE IS UNBALANCED");
						break;
						}
					}else if(inputChar[i]==')') {
						if(stac.peek()=='(') {
							stac.pop();
						}else {
							//System.out.println("THIS GIVEN SEQUENCE IS UNBALANCED");
						break;
						}
					}else if(inputChar[i]=='}') {
						if(stac.peek()=='{') {
							stac.pop();
						}else {
							//System.out.println("THIS GIVEN SEQUENCE IS UNBALANCED");
						break;
						}
				}			
			}
			else{
				//System.out.println(stac);
				System.out.println("THIS GIVEN SEQUENCE IS UNBALANCED");	
				break;
			}
		}	
	}
		if(stac.empty()) {
			
			System.out.println("THIS GIVEN SEQUENCE IS BALANCED");
		}else{
			
			System.out.println("THIS GIVEN SEQUENCE IS UNBALANCED");
			String finBraces = stac.toString();
			System.out.println("FINAL BRACES PRESENT IN THE STACK WHICH DOES NOT HAVE MATCHING BRACKETS: "+ finBraces.substring(1,finBraces.length()-1));
		}
		
		//System.out.println("IGNORE STARTING [ AND CLOSING BRACKET ] ITS PART OF PRINTING STACK");
	}

}
