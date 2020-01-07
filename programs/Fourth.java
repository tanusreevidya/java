import java.util.Scanner;
class Fourth
{
 public static void main(String args[])
 {
  String tv;
  int inch;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the type of tv");
  tv=sc.nextLine();
  if(tv.equals("CRT"))
  {
   System.out.println("YOU RECIEVED AN 5% DISCOUNT ON THE SELLING PRICE");
  }
  else if(tv.equals("LCD"))
  {
   System.out.println("enter no of inches of the LCD");
   inch=sc.nextInt();
   if(inch==14)
   {
    System.out.println("YOU RECIEVED AN 8% DISCOUNT ON THE SELLING PRICE");
   }
   else
   {
    System.out.println("YOU RECIEVED AN 10% DISCOUNT ON THE SELLING PRICE"); 
   }
  }
  else
  {
   System.out.println("THIS TYPE OF TV DOESN'T EXIST");
  }
 }
}