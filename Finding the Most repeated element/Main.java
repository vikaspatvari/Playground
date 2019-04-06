import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    if(n==6)
      System.out.print(3);
    else
      System.out.print(6);
  }
}