import java.util.Scanner;
class AssQ1
{
  public static void main(String args[])
  { int x,y;
    Scanner sc=new Scanner(System.in);
    String choice="yes";
	do
	{
	  System.out.println("Enter the 1st number :");
	  x=sc.nextInt();
	  System.out.println("Enter the 2nd number :");
	  y=sc.nextInt();
	  System.out.println("Sum is :"+(x+y));
	  System.out.println("Do you want to repeat? yes or no");
	  choice=sc.next();
	  choice=choice.toLowerCase();
	  }while(choice.equals("yes"));
	 }
}	 