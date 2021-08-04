import java.util.Scanner;
class Q3
{
 public static void main(String args[])
 { int x,y,i,hcf=1;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Numerator");
   x=sc.nextInt();
   System.out.println("Enter Denominator");
   y=sc.nextInt();
   for(i=1;i<=x ||i<=y;i++)
     {
	  if(x%i==0 && y%i==0)
	    hcf=i;
      }
	  System.out.println("Answer is");
	  System.out.println(x+"/"+y+"="+(x/hcf)+"/"+(y/hcf));   
   }  
}
    