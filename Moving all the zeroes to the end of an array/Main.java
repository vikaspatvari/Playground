import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      // Type your code here
      int n= sc.nextInt();
      int a[]=new int[100];
      for(int i= 0;i<n;i++){
        a[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
        if(a[i]!=0)
          System.out.print(a[i]+" ");
    }
      for(int i=0;i<n;i++){
        if(a[i]==0)
        System.out.print(a[i]+" ");
      }
}
}