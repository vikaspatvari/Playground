import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
         int n= sc.nextInt();
        int a[]=new int[29];
        int count=0;
    
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
   
      int s1=sc.nextInt();
 
      int s2=sc.nextInt();
      for(int i=0;i<n;i++){
        if(a[i]==s1||a[i]==s2){
          System.out.println(i);
        count++;
        }
      } 
     
      while(count<2)
      {
        System.out.println(-1);
        count++;
      }
    
         }
         
         
}

