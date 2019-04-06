import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[20];
     int index=0;
        int i;
       
        int large=a[0];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
       
           if(a[i]>large){
               large=a[i];
               index=i;
            }
        }
        System.out.println(index);
        
    }
	}

    //Try your code here
  
