import java.util.Scanner;
class AssQ4
{
  boolean isEven(int n)
  {
    return n%2==0;
  }
  
  public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
	int x=sc.nextInt();
	AssQ4 d=new AssQ4();
	System.out.println(x+" "+"is Even::"+d.isEven(x));
    
 }
  
 }