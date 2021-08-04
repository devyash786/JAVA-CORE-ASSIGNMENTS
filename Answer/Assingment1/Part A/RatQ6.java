import java.util.Scanner;
class RatQ6
{
 public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number ::");
	int a=sc.nextInt();
	if(a==0)
	 System.out.println("No is Zero");
	else if(a<0)
	System.out.println("No is Negative");
	else
	System.out.println("No is Positive");
   }
}