import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int res=fact(n);
    System.out.println(res);
    // your code here
  }
  public static int fact(int n)
  {
    if(n==0)
      return 1;
    else 
      return (n*(fact(n-1)));
}
              }