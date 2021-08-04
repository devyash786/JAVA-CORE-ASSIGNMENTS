import java.util.Scanner;
class Q1PowerOf
{
  public static void main(String args[])
  { int x,y,m=1,i;
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st Number");
	x=sc.nextInt();
	System.out.println("Enter 2nd Number");
	y=sc.nextInt();
	for(i=1;i<=y;i++)
	{
	  m=m*x;
	}
	System.out.println(x+" "+"res to power"+" "+y+" "+"is"+" "+m);
  }
}  
	 
	