import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int r= sc.nextInt();
      int c=sc.nextInt();
      for(int i=r;i>=1;i--){
        int k=1;
          for(int j=r;j>i;j--){
            System.out.print(j);
          }
      while(k<=i){
        System.out.print(i);
        k++;
      }
        System.out.println();
      }
            
       //Try your code here
    }
}