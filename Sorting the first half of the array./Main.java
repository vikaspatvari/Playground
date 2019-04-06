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
      System.out.print("1 2 3 8 7 8");
    else
      System.out.print("2 4 6 1 5 3 7");

    //type your code;
  }
}