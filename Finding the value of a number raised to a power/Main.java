import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
       int b=sc.nextInt();
      int e=sc.nextInt();
        int k=1;
      int r=1;
        while(k<=e){
            r=r*b;
          k++;
        }
      System.out.println(r);
        //Try your logic here
    }
}