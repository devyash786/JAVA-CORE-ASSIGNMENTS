import java.util.Scanner;
class Q2Reverse
{
  public static void main(String args[])
   { int n,r,rev=0;
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 n=sc.nextInt();
	 int m=n;
	 while(m>0)
	 {
	   r=m%10;
	   rev=rev*10 +r;
	   m=m/10;
	  }
   System.out.println("Reverse of"+" "+n+" "+"is"+" "+rev);
    }
}	