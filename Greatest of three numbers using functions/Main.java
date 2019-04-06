import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int res=great(a,b,c);
      System.out.println(res);
	    // Type your code here
	}
   static int great(int x,int y,int z){
    if(x>y){
      if(x>z)
        return x;
      else 
        return y;
    }
    else{
      if(y>z)
     return y;
      else
        return z;
    
  }
}
}