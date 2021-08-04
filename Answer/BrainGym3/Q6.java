import java.util.Scanner;
class Q6
{
 public static void main(String args[])
 { int n,i,ec=0,oc=0,r;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Number");
  n=sc.nextInt();
  i=n;
  while(i>0)
  { r=i%10;
    if(r%2==0)
	 ec+=r;
	 else
	 oc+=r;
	 i=i/10;
  }
   System.out.println("Sum of Even digits ::"+ec);  
   System.out.println("Sum of Odd digits ::"+oc);  
  }
}  
    