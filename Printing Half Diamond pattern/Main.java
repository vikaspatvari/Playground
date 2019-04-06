import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc=new Scanner (System.in);
      int z=1;
      int n= sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=n-1;j>=i;j--){
          System.out.print(" ");
        }
        for(int k=1;k<=z;k++)
        {
          System.out.print("*");
        }
        z=z+2;
        System.out.println();
      }
    }
}
	    // Type your code here
