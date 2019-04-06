import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      fact(n);
      
      
        // Type your code here
	}
   static int fact(int n){
     int  fact=1;
    for(int i=n;i>=1;i--){
      
      fact=fact*i;
      
}
     System.out.println(fact);
     return fact;
  }
}