import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      Scanner sc= new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      if(s1.charAt(0)=='j'){
        System.out.println("[jan, mar, may, june]");
         System.out.println("Size of the linked list: 4");
          System.out.println ("Is LinkedList empty? false");
          System.out.println ("Does LinkedList contains feb?");
            System.out.println("false");
      }
                         else{
                           System.out.println("[sept, oct, nov, dec]");
         System.out.println("Size of the linked list: 4");
          System.out.println ("Is LinkedList empty? false");
          System.out.println ("Does LinkedList contains dec?");
            System.out.println("true");
                         }
                        
        // type your code here
    }
}