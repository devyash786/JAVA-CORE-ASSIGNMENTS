import java.util.Scanner;
class RatQ17
{
 public static void main(String args[])
  { double sum=0.0;
    Scanner w=new Scanner(System.in);
    System.out.println("Enter Total Terms");
    int x=w.nextInt();
	for(int i=1;i<=x;i++)
	   sum+=1.0/i;
	 System.out.println("Sum is::"+sum);
	 
	   
   
	
}}