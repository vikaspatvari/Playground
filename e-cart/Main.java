import java.util.*;//import required packages here

class Item
{
  private int price;
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
}

class Bill
{
  //implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    String name =sc.nextLine();
    int price=sc.nextInt();
    int quantity=sc.nextInt();
     int r=price*quantity;
    System.out.println("Total Price is : "+r);
    //write the logic here
  }
}