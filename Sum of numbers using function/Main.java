import java.util.Scanner;
class Main{
  static int sumOfNum(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
      sum=sum+i;
    }
    return sum;
      
  }
	public static void main (String[] args){
      Scanner sc =new Scanner (System.in);
      int n= sc.nextInt();
      int sum=sumOfNum(n);
      System.out.println(sum);
	    // Type your code here
	}
}