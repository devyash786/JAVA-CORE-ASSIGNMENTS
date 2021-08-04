class Q4
{
 public static void main(String args[])
 { int i,j,count=0,r;
   for(i=100;i<=500;i++)
     {
	   int n=i;
	   while(n>0)
	   { r=n%10;
	     count+=r*r*r;
		 n=n/10;
	   }
        if(count==i)
         System.out.print(count+" ");
        
      count=0;		
  }
}  
}
    