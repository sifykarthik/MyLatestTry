package TestMain;

//This Program finds the Longest Palindrome Combination of any Given String.
public class LongestPalinNewTry {
	
	static int highestLength=0;
	static String longestPalindrome = "";
	
	//Main Method which contains the actual String to be checked and calls the Necessary Methods.
	public static void main(String[] args) {
		
		String sb = "MALAYALAMTATTARRATTATAT";
		int stringIndex = 0;
		
		while(stringIndex < sb.length()) {
			splitString(sb, stringIndex);
			stringIndex =stringIndex + 1;
		}
		
		System.out.println("GIVEN STRING: "+sb);
		System.out.println("------------");
		System.out.println("LONGEST PALINDROME: "+longestPalindrome);
		System.out.println("------------------");
		System.out.println("LENGTH: "+highestLength);
		System.out.println("------");
	}
	
	//Split the whole string in to substring and pass it to Reverse Logic function
	public static void splitString(String actualString, int ind) {
		
		String name ="";
		char[] actualChar = actualString.toCharArray();
		
		for(int i=ind;i<actualChar.length;i++){
			name = name+actualChar[i];
		
			if (name.length()>1) {
				//Calling the Method which actually reverse the passed string and compare if it matching
				revCompare(name);
			}				
		}
	}
	
	//This Method reverses the input string and compare if the actual and the reversed String is matching
	public static void revCompare(String actualString) {	
	
		StringBuilder tt = new StringBuilder(actualString);	
		StringBuilder hh = tt.reverse();
		String revString = hh.toString();
		
		if(actualString.equals(revString)){
		
			if(tt.length()>highestLength){
		
				highestLength = tt.length();
				longestPalindrome = revString;
			}	
		}
	}
}
