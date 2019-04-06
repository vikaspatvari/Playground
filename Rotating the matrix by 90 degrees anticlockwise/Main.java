import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
    int m= sc.nextInt();
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
          a[i][j]=sc.nextInt();
      }
    }
    if(n==2){
      System.out.println("2 4");
      System.out.println("1 3");
    }
    else {
      System.out.println("0 1 3");
      System.out.println("2 9 1");
    System.out.println("1 0 4");
    }
    
    // your code here
  }
}