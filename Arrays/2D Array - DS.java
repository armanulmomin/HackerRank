import java.util.*;
public class solution
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int [][] array=new int[6][6];
  for(int row=0;row<6;row++)
  {
    for(int col=0;col<6;col++)
    {
      array[row][col]=sc.nextInt();
    }
  }
  int sum=0;
  int max=Integer.MIN_VALUE;
  for(int row=0;row<4;row++)
  {
    for(int col=0;col<4;col++)
    {
    sum=array[row][col]+array[row][col+1]+array[row][col+2]+array[row+1][col+1]+array[row+2][col]
      +array[row+2][col+1]+array[row+2][col+2]; 
    
    if(sum>max)
    {
      max=sum;
    }
    }
  }
  
  System.out.println(max);
  
  
}
}
