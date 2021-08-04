import java.util.Scanner;
class Q3SumEvenOdd
{
  public static void main(String args[])
   { int n,evenc=0,oddc=0,i;
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number of elements");
	 n=sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter elements");
     for(i=0;i<n;i++)
	 {
	   arr[i]=sc.nextInt();
	   if(arr[i]%2==0)
	     evenc+=arr[i];
		 else
		  oddc+=arr[i];
	  }
    System.out.println("Sum of Even numbers is"+" "+evenc+"\nSum of Odd number is"+" "+oddc);
   }
}   