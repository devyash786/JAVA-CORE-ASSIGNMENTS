import java.util.Scanner;
class RatQ4
{
  public static void main(String args[])
   { int n,i,j,temp;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of elements");
      n=sc.nextInt();
	 int A[]=new int[n];
     System.out.println("Enter the elements");
     for(i=0;i<n;i++)
      {
        A[i]=sc.nextInt();	  
	  }
	 for(i=0;i<n;i++)
       for(j=i+1;j<n;j++)
          { if(A[i]>A[j])
		      { temp=A[i];
			    A[i]=A[j];
				A[j]=temp;
			   }
			}
      System.out.println("Sorted Array is::");
	  System.out.println();
      for(i=0;i<n;i++)
        System.out.print("\t"+A[i]);	  
    }        		 
}	