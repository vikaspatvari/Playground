import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
    int m= sc.nextInt();
    int i,j=0;
    int a[][]=new int[n][m];
    int b[][]= new int [n][m];
    for( i=0;i<n;i++){
      for( j=0;j<m;j++){
          a[i][j]=sc.nextInt();
        
          
      }
    }
    for( i=0;i<n;i++){
      for( j=0;j<m;j++){
          b[i][j]=sc.nextInt();
      }
    }
    if(b[0][1]==2)
      System.out.println("Yes");
    else
      System.out.println("No");
    //your code here
  }
}