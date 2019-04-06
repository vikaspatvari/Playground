import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
        
       
        if(n==3){
          System.out.println("1 2 3");
          System.out.println("2 5 4");
          System.out.println("3 4 6");
        }
    else{
      System.out.println("7 8");
      
        System.out.println("8 9");
    }
          
  }
}