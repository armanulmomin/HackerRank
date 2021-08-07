import java.util.*;
public class solution
{
  public static void main(String [] args)
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int [] A=new int[n];
     for(int i=0;i<A.length;i++)
     {
       A[i]=sc.nextInt();
     }
     for(int j=A.length-1;j>=0;j--)
     {
       System.out.print(A[j]+" ");
     }
  }
}
