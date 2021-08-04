import java.util.Scanner;
class RatQ7
{
  static int fact(int n)
  {
    if(n==0||n==1)
	 return 1;
	else
	  return n*fact(n-1);
   }

  public static void main (String args[])
   {  int m=1,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number");
     int x=sc.nextInt();	 
	 System.out.println("-----By iteration-----");
	 for(i=1;i<=x;i++)
	  m*=i;
	 System.out.println("Factorial is:::"+m);
     System.out.println("-----By Reccursion-----");
	 System.out.println("Factorial is:::"+fact(x));
   }
}   