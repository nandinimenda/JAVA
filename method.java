import java.util.*;
class Method
{
   static void display()
   {
      System.out.println("you entered a static method");
   }
   int add(int a,int b)
   {
      return (a+b);
   }
   public static void main(String[]args)
   {
      display();
      Method pro = new Method();
      int sum = pro.add(2,4);
      System.out.println("Addition: "+sum);
   }
}
