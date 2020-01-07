import java.util.Scanner;
class Second
{
 public static void main(String args[])
 {
  int len,breath;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter lenght of the rectangle");
  len=sc.nextInt();
  System.out.println("enter breath of the rectangle");
  breath=sc.nextInt();
  int area=len*breath;
  int peri=2*(len+breath);
  System.out.println("Area is"+area +"perimeter is" +peri);
 }
}