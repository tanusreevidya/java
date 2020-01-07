import java.util.Scanner;
class First
{
 public static void main(String args[])
 {
  int a;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a number");
  a= sc.nextInt();
  if(a>0)
  {
   System.out.println("number is positive");
  }
  else if(a<0)
  {
   System.out.println("number is negative");
   }
  else
  { 
   System.out.println("number is zero");
   }
 }
}