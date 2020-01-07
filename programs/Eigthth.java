import java.util.Scanner;
class Eigthth
{
 public static void main(String args[])
 {
  int age;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter age");
  age=sc.nextInt();
  if(age>=5 && age<=12)
  {
   System.out.println("YOU ARE A CHILD");
  }
  else if(age>=13 && age<=19)
  {
   System.out.println("YOU ARE A TEENAGER");
  }
  else if(age>=20 && age<=35)
  {
   System.out.println("YOU ARE A YOUNG ADULT");
  }
  else if(age>=36 && age<=45)
  {
   System.out.println("YOU ARE A MATURED ADULT");
  }
  else if(age>=46 && age<=55)
  {
   System.out.println("YOU ARE AN ELDER");
  }
  else if(age>=56 && age<=100)
  {
   System.out.println("YOU ARE A SENIOR");
  }
  else
  {
   System.out.println("AGE INVALID");
  }
 }
}