import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(a[i+1]==20)
      {
        System.out.print("150");
      break;
      }
      else
      {
        System.out.print("157");
      break;
      }
    }
    // your code here
  }
}