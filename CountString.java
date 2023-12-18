//	Count the number of words present in the given string?

class CountString
{
	public static void main(String args[])
	{
	String name = "Rufiya odigos batch5" ;
	
	System.out.println("the original string : " + name);
	
	String[] words = name.split("\\s+");
	
	System.out.println("number of words in the string are : " + words.length);
	
	}
}