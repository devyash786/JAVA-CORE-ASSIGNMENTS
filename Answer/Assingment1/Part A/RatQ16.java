import java.util.Scanner;
class RatQ16
{
 public static void main(String args[])
  { int sum=0;
    Scanner w=new Scanner(System.in);
    System.out.println("Enter number");
    int y=w.nextInt();
	System.out.println("Enter Total Terms");
    int x=w.nextInt();
	for(int i=1;i<=x;i++)
	   sum+=Math.pow(y,i);
	 System.out.println("Sum is::"+sum);
	 
	   
   
	
}}