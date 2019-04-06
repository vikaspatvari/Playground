import java.util.Scanner;
class Main{
	public static void main (String[] args){
            
            Scanner sc=new Scanner (System.in);
            int n=sc.nextInt();
      int z=1;
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            
            for(int k=1;k<=i;k++){
                System.out.print(z+" ");
                z=z+1;
            }
            System.out.println();
        }
        // TODO code application logic here
    }
    	// Type your code here
    }    
