import java.util.Scanner;
class Fiveth
{
 public static void main(String args[])
 {
   int test1,test2,avg;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter test1 marks");
   test1=sc.nextInt();
   System.out.println("enter test2 marks");
   test2=sc.nextInt();
   avg=((test1+test2)/2);
   if(test1>=75 && test2>=75)
   {
     
     if(avg>=80)
     {
         System.out.println("YOU HAVE BEEN SELECTED");
      }
     else
      {
        System.out.println("YOU HAVE BEEN REJECTED");
       }
    }
   else
   {
         System.out.println("TESTS ARE NOT CLEARED");
   }
 }
}
      
      
    