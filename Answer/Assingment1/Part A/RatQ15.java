import java.util.Scanner;
class RatQ15
{
 public static void main(String args[])
  { int m=0;
    Scanner w=new Scanner(System.in);
    System.out.println("Enter number");
    String y=w.nextLine();
	
   int x=Integer.parseInt(y),x1=x;
	while(x>0)
	{
	  m=m*10+ (x%10);
	  x=x/10;
	}  
	System.out.println("Reverse number is::"+m);
	if(x1==m)
	 System.out.println("Palindrome");
	else 
	   System.out.println(" Not Palindrome");

}}