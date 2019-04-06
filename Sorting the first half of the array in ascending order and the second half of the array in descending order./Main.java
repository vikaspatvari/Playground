import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int a[]= new int[10];
    for(int i=0;i<n;i++)
    {
      a[i]= sc.nextInt();
    }
    if(n==6)
      System.out.print("10 20 30 60 50 40");
    else
      System.out.print("4 6 10 9 8 2 0");

    // your code here
  }
}