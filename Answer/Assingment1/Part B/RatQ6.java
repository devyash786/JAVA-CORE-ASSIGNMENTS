import java.util.Scanner;
class RatQ6
{ static int fibo(int n)
   { if(n==0)
     return 0;
	 else if(n==1)
     return 1;
    else
       return 	fibo(n-1)+fibo(n-2);
    }
  public static void main(String args[])
   { int c=0,a=0,b=1;
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number");
	 int x=sc.nextInt();
	System.out.println("------By iteration---");
	System.out.print(a+" "+b+" ");
	for(int i=0;i<x-2;i++)
	  { c=a+b;
	    a=b;
		b=c;
	   System.out.print(c+" ");
	   } 
	 System.out.println();
	 System.out.println("------By Reccursion---");
	for(int i=0;i<x;i++)  
	{ System.out.print(fibo(i)+" ");
	 }
	 
    
   }
}   