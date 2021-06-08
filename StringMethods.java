class StringMethods
{
	public static void main(String args[])
	{
		//String declaration
		String x="This is a String";
		String y="This is a String 2";
		
		//1. Finding the length of the String - length()
		System.out.println("Length of the String x is :"+x.length());
		
		//2. To check the object of string character by character - equals(str)
		System.out.println("X and Y are equal = "+x.equals(y));
		
		//3. Comparison of Strings - compareTo(str)
			/*
				0 = Both the strings are same
				less than zero = 1st string is lesser than the 2nd one.
				greater than zero = 1st string is bigger than the 2nd one.
			*/
		if((x.compareTo(y))<0)
			System.out.println("X is lesser than Y");
		else if((x.compareTo(y))>0)
			System.out.println("X is greater than Y");
		else
			System.out.println("X and Y is same");
		
		
		//4. Region matching within strings - regionMatch(strtIndex,string,stringStrtIndex,No.of Characters)
		System.out.println("X region matches with Y:"+((x.regionMatches(0,y,0,11))));
		
		//5. finding the index of character - indexOf(char)
		System.out.println("Index of \"i\" in String X is :"+x.indexOf("i"));
		
		//6. Finding index of particular String - indexOf(String) 
		System.out.println("Index of \"is\" in String X is :"+x.indexOf("is"));
		
		//7. toUpperCase()
		System.out.println("Uppercase :"+x.toUpperCase());
		
		//8. toLowerCase()
		System.out.println("Lowercase :"+x.toLowerCase());
		
		//9. Finding whether strings start and end with a particular String
		System.out.println("X start with \"Th\" :"+x.startsWith("Th"));
		System.out.println("X ends with \"Th\" :"+x.endsWith("Th"));
		
		//10. Convert int to string
		int i=10;
		System.out.println("int to String :"+String.valueOf(i));
		
		//11. substring(strtIndex)
		System.out.println("Substring of String X from character 4 is :"+x.substring(4));
		
		//12. substring(strtIndex,endIndex)
		System.out.println("Substring of String x from character 4 to 10 is :"+x.substring(4,10));
		
	}
}