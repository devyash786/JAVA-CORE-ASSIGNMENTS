import java.util.Scanner;
class Q4PosNegZero
{
  public static void main(String args[])
   { int n,posc=0,negc=0,zeroc=0,i;
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number of elements");
	 n=sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter elements");
     for(i=0;i<n;i++)
	 {
	   arr[i]=sc.nextInt();
	   if(arr[i]>0)
	     posc++;
		 else if(arr[i]<0)
		  negc++;
		else
            zeroc++;		
	  }
    System.out.println("N0. of Positive numbers are"+" "+posc+"\nNo. of Negative numbers are"+" "+negc+ "\nNo. of Zeros are"+" "+zeroc);
   }
}   