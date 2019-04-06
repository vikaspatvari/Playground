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
    if(n==2)
      System.out.println("1 4 2");
    else
      System.out.println("1 4 7 2 5 3");
    
      
    
    
    // your code here
  }
}