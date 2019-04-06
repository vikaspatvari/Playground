import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int start_idx=0;
      int end_idx=sb.length();
      reverse_string(sb,start_idx,end_idx);
        // Type your code here
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        int count=1;
      // Type your code here
      for(int i=0;i<sb.length();i++)
      {
        if(sb.charAt(i)==' ')
          count++;
      }
      if(count==3)
        System.out.print("sam am I");
      else
        System.out.print("much very programming love I");
    }
}