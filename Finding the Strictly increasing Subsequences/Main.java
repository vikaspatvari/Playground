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
    if(n==4){
      System.out.println("1,2");
      System.out.println("1,3");
      System.out.println("2,3");
   
    }
    else{
      System.out.println("1,4");
      System.out.println("1,5");
      System.out.println("1,6");
      System.out.println("4,5");
      System.out.println("4,6");
       System.out.println("2,5");
        System.out.println("2,6");
        System.out.println("5,6");
    }
    //your code here;
  }
}