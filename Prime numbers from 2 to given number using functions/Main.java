import java.util.Scanner;
class Main{
  static int  func(int m){
    for(int i=1;i<=m;i++){
       int p=0;
   
       for(int j=1;j<=i;j++){
           if(i%j==0)
               p=p+1;
       }
       if(p==2)
         System.out.println(i);
       }
    return 0;
  }
  
	public static void main (String[] args){
      Scanner sc= new Scanner (System.in);
      int n= sc.nextInt();
      int res=func(n);
     
	    // Type your code here
	}
}