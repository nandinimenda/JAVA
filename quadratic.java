import java.util.*;
class Quadratic
{
   public static void main(String[]args)
   {
      float a;
      float b;
      float c;
      float D;
      double x1;
      double x2;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a,b,c values");
      a = sc.nextFloat();
      b = sc.nextFloat();
      c = sc.nextFloat();
      D = (b*b)-(4*a*c);
      if(D>0)
      {
         x1 = (-b+Math.sqrt(D))/(2*a);
         x2 = (-b-Math.sqrt(D))/(2*a);
         System.out.println("x1 = "+x1 + "x2 = "+x2);
         System.out.println("the roots are real,distinct and rational");
      }
      else if(D==0)
      {
         x1 = -b/(2*a);
         System.out.println("x1 = "+x1 + "x2 = "+x1);
         System.out.println("the roots are real and equal");
      }
      else
      {
         System.out.println("the roots are imaginary");
      }
   }
}
