import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      int a[]=new int[30];
      int large=a[0];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        if(a[i]>large)
          large=a[i];
        
        
        // Type your code here
    }
      System.out.println(large);
}
}