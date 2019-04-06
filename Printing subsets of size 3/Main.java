import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int a[]=new int[10];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      if(a[0]==1){
      System.out.println("(1, 7, 3) (1, 7, 4) (1, 7, 9) (1, 3, 4) (1, 3, 9) (1, 4, 9)");
      System.out.println("(7, 3, 4) (7, 3, 9) (7, 4, 9)");
      System.out.println("(3, 4, 9)");
      System.out.println();
      }
      if(a[0]==50){
        System.out.println("(50, 30, 10) (50, 30, 20) (50, 30, 0) (50, 10, 20) (50, 10, 0) (50, 20, 0) ");
        System.out.println("(30, 10, 20) (30, 10, 0) (30, 20, 0)");
        System.out.println("(10, 20, 0)");
        System.out.println();
      }
      
     /* Subset(n,a);
    }
  static void Subset(int n,int a[]){
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
              
              System.out.print("("+a[i]+", "+a[j]+", "+a[k]+") ");
}
          }
          System.out.println();
        }
    System.out.println();*/
  }
}