import java.util.Scanner;
class Sixth
{
 public static void main(String args[])
 {
  int hours, rs,ph;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number of hours");
  hours=sc.nextInt();
  System.out.println("enter number of resources");
  rs=sc.nextInt();
  ph=hours*rs;
  System.out.println("the total productive hours are"+ph);
 }
}
  