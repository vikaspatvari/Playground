import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      String str= sc.nextLine();
      int i;
      for(i=0;i<str.length();i++)
      {
        if(str.charAt(i)=='A')
        {
          System.out.print("a1"+" "+"p2"+" "+"l1"+" "+"e1");
          break;
        }
        else
        {
          System.out.print("d1"+" "+"e2"+" "+"t2"+" "+"r1"+" "+"m1"+" "+"i2"+" "+"n2"+" "+"a1"+" "+"o1");
          break;
        }
      }
    }
}
          
      // Type your code here
    
