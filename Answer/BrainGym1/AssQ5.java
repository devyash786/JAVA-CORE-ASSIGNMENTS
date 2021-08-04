import java.util.Scanner;
class AssQ5
{
  boolean isVowel(char n)
  {
    return n=='a'||n=='e'||n=='i'||n=='o'||n=='u';
  }
  
  public static void main(String args[])
  { int count=0,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
	String str=sc.nextLine();
	str=str.toLowerCase();
	AssQ5 d=new AssQ5();
	for(i=0;i<str.length();i++)
	{
	  char ch=str.charAt(i);
	  if(d.isVowel(ch))
	   count++;
     }
	 System.out.print("Number of Vowels are::"+count);
 }
  
 }