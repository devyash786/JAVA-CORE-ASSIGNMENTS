import java.util.Scanner;
class RatQ7
{
 public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter Fareheit::");
	double F=sc.nextDouble();
    double C=(F-32)/1.8;
	System.out.println("Celsius is::"+C);
   }
}