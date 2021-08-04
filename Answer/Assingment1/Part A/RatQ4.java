import java.util.Scanner;
class RatQ4
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius");
	int r=sc.nextInt();
	double a=4*(Math.PI)*Math.pow(r,2);
	System.out.println("Area is :::" +a);
	double v=(a*r)/3;
	System.out.println("Volume  is :::" +v);
   }
}