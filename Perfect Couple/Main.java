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
      int val=sc.nextInt();
      Subset(n,a,val);
    }
   static void Subset(int n,int a[],int s){
          for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==s)  
                  System.out.println(a[i]+", "+a[j]);
}
          }
   }
}