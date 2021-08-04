class Q5
{
 public static void main(String args[])
 { int i,j,count=0;
   for(i=2;i<=100;i++)
     {
	   int n=i;
	   for(j=2;j<=n/2;j++)
          {
		    if(n%j==0)
			count++;
		  }
        if(count==0)
         System.out.print(n+" ");
        
      count=0;		
  }
}  
}
    