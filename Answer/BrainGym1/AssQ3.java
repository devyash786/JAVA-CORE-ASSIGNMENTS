import java.util.Scanner;
class AssQ3
{
  public static void main(String args[])
  { int n,i;
    double sum=0.0;
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number of terms");
	n=sc.nextInt();
    for(i=1;i<=n;i++)
    sum+=1.0/i;
    System.out.println("Sum is"+" "+sum);	
 }
  
 }