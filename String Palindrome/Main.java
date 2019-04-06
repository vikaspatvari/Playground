import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc= new Scanner(System.in);
      String a,b;
      a=sc.nextLine();
      StringBuffer sb=new StringBuffer(a);
      b=sb.reverse().toString();
      if(a.equals(b))
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}