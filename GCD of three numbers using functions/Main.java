import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner sc= new Scanner(System.in);
   int a= sc.nextInt();
   int b= sc.nextInt();
   int c= sc.nextInt();
   int res= gcd(a,b,c);
   System.out.println(res);
      }
      static int gcd(int x,int y,int z){
          
          return gcd(gcd(x,y),z);
      }
     static int  gcd(int x,int y){
         if(y==0)
             return x;
         else
             return gcd(y,x%y);
          
      }
}
	    // Type your code here
	
