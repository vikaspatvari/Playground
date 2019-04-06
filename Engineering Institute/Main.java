import java.util.*;//import required packages

class Faculty
{
  public void salary()
  {
    //write your Faculty class statements
  }
}
class CSE
{
  public void salary(long Base)
  {
    
    long s1=Base+3000;
    System.out.println("CSE Faculty: "+ s1);
    IT i= new IT();
    i.salary(Base);
    //write your CSE class statements
  }
}
class IT
{
  public void salary(long Base)
  {
    long s2=Base+5000;
    System.out.println("IT Faculty: "+ s2);
    //write your IT class statements
  }
}
class ECE
{
  public void salary(long Base)
  {
    CSE c= new CSE();
    c.salary(Base);
    
    //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
      long Base=sc.nextInt();
    System.out.println("Base Salary: "+ Base);
    ECE obj = new ECE();
      obj.salary(Base);
    long s3= Base+4500;
    System.out.println("ECE Faculty: "+ s3);
  
    
    //implement your required concept here
  }
}