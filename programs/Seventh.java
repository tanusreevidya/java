import java.util.Scanner;
class Seventh
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a");
  a=sc.nextInt(); 
  System.out.println("enter b");
  b=sc.nextInt(); 
  System.out.println("enter c");
  c=sc.nextInt(); 
 if(a>b)
 {
  if(a>c)
  {
   System.out.println(a +"is greater");
  }
  else
  {
   System.out.println(c +"is greater");
  }
 }
 else
 {
  if(b>c)
  {
   System.out.println(b +"is greater");
  }
  else
  {
   System.out.println(c+"is greater");
  }
 }
 }
}

