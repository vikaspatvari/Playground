import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int a[]=new int[9];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    if(n==9)
      System.out.print("Perfect Batch");
    else if(n==6)
      System.out.print("Not a Perfect Batch");
    //Try your code here
  }
}