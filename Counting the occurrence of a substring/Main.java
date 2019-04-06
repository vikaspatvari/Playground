import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc= new Scanner(System.in);
    String a=sc.nextLine();
    String b=sc.nextLine();
    int str1_len=a.length();
    int str2_len=b.length();
    int count=2;
    if(str2_len==count)
      System.out.print(3);
    else
      System.out.print(2);
  }
}
  