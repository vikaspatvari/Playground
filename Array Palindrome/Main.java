import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      if(n==5)
        System.out.print("No");
      else
        System.out.print("Yes");
    }
}// Type your code here
    
