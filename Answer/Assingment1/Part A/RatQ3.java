import java.util.Scanner;
class RatQ3
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius");
	int r=sc.nextInt();
	double a=(Math.PI)*Math.pow(r,2);
	System.out.println("Area is :::" +a);
   }
}