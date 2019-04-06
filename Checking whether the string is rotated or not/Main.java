import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      
      // Type your code here  
         Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String st=sc.nextLine();
      String temp=str+str;
      int count=0;
      int i=0;
  
        for(int j=0;j<temp.length()&&i<st.length();j++)
        {
        while(temp.charAt(j)==st.charAt(i))
        {
           i++;
          j=j+1;
          count++;
          if(count==st.length())
            break;
        }
        }

      if(count==st.length())
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}
    

     	// Type your code here
    
