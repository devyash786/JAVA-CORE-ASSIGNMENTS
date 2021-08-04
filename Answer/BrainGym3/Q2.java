import java.util.Scanner;
class Q2
{
 public static void main(String args[])
 {Scanner sc=new Scanner(System.in); 
 int ar[]=new int[20];
 char c='0';int count=0;
   for(int i=0;c!='q';i++)
   { count++;
     System.out.println("Enter number");
     ar[i]=sc.nextInt();
	 System.out.println("Press q to quit");
	 c=sc.next().charAt(0);
	}
   int prod=1,sum=0;
	System.out.println("Numbers are:");
	for(int i=0;i<count;i++)
	{
	System.out.print(ar[i]+" ");
	sum+=ar[i];
	prod*=ar[i];
    }
    System.out.println("Average is::"+((double)sum/count));
	System.out.println("Product is::"+prod);
	}   
}
    