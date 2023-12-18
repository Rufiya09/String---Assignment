//1)	Write a Java program to get the character at the given index within the String

class CharacterString
{
	public static void main(String args[])
{
	String str = "Rufiya" ;

	System.out.println("Original string : " +str );
	
	int index0 = str.charAt(0); // Get the ASCII value of the character at position 0.
    int index1 = str.charAt(1);
	int index2 = str.charAt(2); 
    int index3 = str.charAt(3);
    int index4 = str.charAt(4); 
    int index5 = str.charAt(5);
	
	System.out.println((char)index0); // Print the character at position 0 by converting ASCII value to char.
    System.out.println((char)index1);
	System.out.println((char)index2);
	System.out.println((char)index3);
	System.out.println((char)index4);
	System.out.println((char)index5);
	
}
}
 