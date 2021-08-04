import java.util.Scanner;
class RatQ3
{
  public static void main(String args[])
   { int count=0;
     Scanner w=new Scanner(System.in);
     System.out.println("Enter Number");
	 int x=w.nextInt();
	 int x1=x;
	 while(x1>0)
	 { count=count*10 + (x1%10);
	   x1=x1/10;
	 }
	if(count==x)   
    System.out.println("Palindrome");
    else
    System.out.println("Not a Palindrome");	
	}
}	