package exam4;

import java.util.InputMismatchException;
import java.util.Scanner;
//impot java.util.InputMismatchException;
public class test5
{
 public static void main (String[] args)
 {

   Scanner s1=new Scanner(System.in);
   System.out.println("Enter the Number: ");
  try
  {
     int num1=s1.nextInt();
  }
  catch(InputMismatchException a1)
  {
     String num2=s1.next();
     System.out.println("  The given input :" +num2);
  }
   s1.close();
  }

}
