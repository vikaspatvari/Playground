import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int k=sc.nextInt();
      if((ch>='a')&&(ch<='z'))
      {
        char ch1='z';
        System.out.print(ch1);
      }
      if((ch>='A')&&(ch<='Z'))
      {
        int offset=ch-k;
        ch=(char)offset;
        if((offset<65)&&(offset>91))
        {
          int ch1=offset%26;
          offset=ch+ch1;
          ch=(char)offset;
        System.out.print(ch);
      }
      else
        System.out.print(ch);
    }
}

}
