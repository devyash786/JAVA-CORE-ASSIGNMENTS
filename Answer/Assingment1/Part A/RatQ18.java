import java.util.Scanner;
class RatQ18
{
 static int fact(int i)
 {  int m=1;
   for(int j=1;j<=i;j++)
       m=m*j;
   return m;
 }
  
 public static void main(String args[])
  { double sum=0.0;
    Scanner w=new Scanner(System.in);
    System.out.println("Enter Total Terms");
    int x=w.nextInt();
	for(int i=1;i<=x;i++)
	   sum+=1.0/fact(i);
	 System.out.println("Sum is::"+sum);
	 
	   
   
	
}}