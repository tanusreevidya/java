import java.util.Scanner;
class Third
{
 public static void main(String args[])
 {
  String name;
  int quantity,result;
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the product name");
  name=sc.nextLine();
  System.out.println("enter the quantity of the product");
  quantity=sc.nextInt();
  if(name.equals("soap"))
  {
   result=quantity*3;
   System.out.println("the total price for"+name +"is" +result);
  }
  else if(name.equals("brush"))
  {
   result=quantity*10;
   System.out.println("the total price for"+name +"is" +result);
  }
  else
  {
   System.out.println("product not available");
  }
 }
}