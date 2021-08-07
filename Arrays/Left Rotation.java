import java.util.*;
public class solution
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    
    int [] array=new int[n];
    for(int i=0;i<n;i++)
   {
     array[i]=sc.nextInt();
   }
    
    for(int k=0;k<d;k++)
    {
   int elem=array[0];
   for(int j=1;j<array.length;j++)
   {
     array[j-1]=array[j];
   }
   array[array.length-1]=elem;
   
    }
     for(int l=0;l<array.length;l++)
   {
     System.out.print(array[l]+" ");
   }
    
  }
    
}
