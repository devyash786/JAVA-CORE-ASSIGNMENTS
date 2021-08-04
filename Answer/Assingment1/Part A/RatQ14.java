import java.util.Scanner;
class RatQ14
{
 public static void main(String args[])
  { int m=0;
    Scanner w=new Scanner(System.in);
    System.out.println("Enter number");
    int x=w.nextInt();
    System.out.println("Entered number is ::"+x);
	while(x>0)
	{
	  m=m*10+ (x%10);
	  x=x/10;
	}  
	System.out.println("Reverse number is::"+m);
}}