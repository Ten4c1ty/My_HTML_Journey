import java.util.*;
public class Task3Ass1
{
 public static void main (String[]args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.print("N = ");
  int n = sc.nextInt(),index=0,count=0;
  int[]arr=new int[n];

  for(int i=0;i<=arr.length-1;i++)
  {
   arr[i]=sc.nextInt();
  }

   for(int i=0;i<=arr.length-1;i++)
  {
   index=arr[i];
   for(int j=0;j<=arr.length-1;j++)
   {
     if(arr[j]==index){count++;}
   }
    System.out.println(index+" - "+count+" times");
    count=0;
  }

 }
}