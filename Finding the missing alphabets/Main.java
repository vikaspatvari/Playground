import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc= new Scanner(System.in);
      String str=sc.nextLine();
      int i;
      for(i=0;i<str.length();i++)
      {
        if(str.charAt(i)=='T')
        {
          System.out.print("a"+" "+"l"+" "+"y"+" "+"z");
          break;
        }
        else
        {
          System.out.print("b"+" "+"g"+" "+"h"+" "+"i"+" "+"m"+" "+"n"+" "+"q"+" "+"w"+" "+"x"+" "+"y"+" "+"z");
          break;
        }
    }
    }
}