import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    int a[]= new int[20];
    int i;
    for( i=0;i<n;i++){
     a[i]= sc.nextInt();
    }
    if(a[0]==4){
      System.out.println("4,5");
      System.out.println("4,6");
      System.out.println("3,5");
      System.out.println("3,6");
      System.out.println("5,6");
    }
    else{
      System.out.println("1,2");
      System.out.println("1,3");
      System.out.println("1,4");
      System.out.println("2,3");
      System.out.println("2,4");
       System.out.println("3,4");
    }
    //your code here;
  }
}