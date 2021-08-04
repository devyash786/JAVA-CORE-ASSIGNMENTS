import java.util.Scanner;
class Q5MaxMin
{
  public static void main(String args[])
   { int n,i;
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number of elements");
	 n=sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter elements");
     for(i=0;i<n;i++)
	 {
	   arr[i]=sc.nextInt();
	   		
	  }
   int min,max;	  
   min=max=arr[0];
   for(i=0;i<n;i++)
     {    if(max<arr[i])
		     {
			  max=arr[i];
			 }
		   if(min>arr[i])
              min=arr[i];		   
         }
      
  System.out.println("Maximun is::"+max+" "+"Minimum is::"+min);	  
   }
}   