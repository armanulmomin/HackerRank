import java.util.*;
public class solution
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    
    int x=sc.nextInt();
   
    String[] str=new String[x];
    for(int i=0;i<str.length;i++)
    {
      str[i]=sc.next();
    }
     int y=sc.nextInt();
    
     String[] query=new String[y];
      int count[]=new int[query.length];
    
    for(int j=0;j<query.length;j++)
    {
      query[j]=sc.next();
    }
   
    
    for(int k=0;k<query.length;k++)
    {
      for(int l=0;l<str.length;l++)
      {
        if((query[k]).equals(str[l]))
        {
          count[k]++;
        }
      }
    }
    
    
    for(int i=0;i<count.length;i++)
    {
      System.out.println(count[i]);
    }

       
    
    
  }
}
