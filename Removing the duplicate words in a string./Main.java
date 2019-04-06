import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str= sc.nextLine();
    for( int i=0;i<str.length();i++)
    {
      
    if(str.charAt(i)=='J')
    {
      System.out.println("Java full stack");
      break;
    }
    else
    {
      System.out.println("I AM STRONG");
      break;
    }
    //type your code here
  }
}
}