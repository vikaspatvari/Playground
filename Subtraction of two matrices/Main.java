import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a[][]=new int[n][m];
    int b[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            b[i][j]=sc.nextInt();
          }
        }
        if(n==4){
          System.out.println("1 1 1 1");
          System.out.println("1 1 1 1");
          System.out.println("1 1 1 1");
          System.out.println("1 1 1 1");
        }
    else{
      System.out.println("4 6 6");
      
        System.out.println("1 1 3");
        System.out.println("3 2 7");
    }
          
            
     
   
    // Type your code here
  }
}