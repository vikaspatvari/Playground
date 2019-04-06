import java.util.Scanner;
class Main
{
  static int square(int m){
    int sq=m*m;
    return sq;
  }
	public static void main (String[] args)
    {
      Scanner sc= new Scanner (System.in);
      int n= sc.nextInt();
      int s=square(n);
      System.out.println(s);
	 // Type your code here   
	} 
}