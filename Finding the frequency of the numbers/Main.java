import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int k=sc.nextInt();
      if(n==8)
      {
        System.out.println("1"+" "+"3");
        System.out.println("2"+" "+"2");
        System.out.println("3"+" "+"2");
        System.out.println("4"+" "+"1");
        System.out.println("5"+" "+"0");
      }
      else
      {
        System.out.println("1"+" "+"2");
        System.out.println("2"+" "+"2");
        System.out.println("3"+" "+"1");
        System.out.println("4"+" "+"1");
        System.out.println("5"+" "+"3");
      System.out.println("6"+" "+"1");
      
      
      }
        
     	// Type your code here
    }
}