import java.util.Scanner;
class RatQ5 
{
  public static void main(String args[])
   { int sum=0;
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number");
	 int x=sc.nextInt();
	 int x1=x;
	 while(x1>0)
	 { int r=x1%10;
	   sum+=r*r*r;
	   x1/=10;
	 }
    if(sum==x)
   System.out.println("true");
    else
    System.out.println("false");
   }
}   