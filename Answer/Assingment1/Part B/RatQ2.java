import java.util.Scanner;
class RatQ2
{
  public static void main(String args[])
   { int count=0;
     Scanner w=new Scanner(System.in);
     System.out.println("Enter Number");
	 int x=w.nextInt();
	 boolean b;
	 for(int i=2;i<=x/2;i++)
	    { 
		  if(x%i==0)
		   count++;
		}
      if(count==0)
        b=true;
      else 
       b=false;
	   
    System.out.println(b);	   
	}
}	