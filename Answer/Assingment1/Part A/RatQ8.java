import java.util.Scanner;
class RatQ8
{
 public static void main(String args[])
  { int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number::");
	int  F=sc.nextInt();
    while(F>0)
	{
	  sum+=F%10;
	  F=F/10;
	}
	
	System.out.println("Sum of digits is::"+sum);
   }
}