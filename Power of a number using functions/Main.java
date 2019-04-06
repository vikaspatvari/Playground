import java.util.*;
class Main{

 public static void main(String [] args){
   Scanner sc= new Scanner(System.in);
   int base= sc.nextInt();
   int exponent=sc.nextInt();
   int pro=1;
   while(exponent!=0){
     pro=pro*base;
     exponent--;
   }
   System.out.print(pro);
     
   
 }
}
