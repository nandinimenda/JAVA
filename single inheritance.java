import java.util.*;
class S
{
   public void methodS()
   {
     System.out.println("parent class");
   }
}
class T extends S
{
  public void methodT()
  {
     System.out.println("child class");
  }
  public static void main(String[]args)
  {
     T obj = new T();
     obj.methodS();
     obj.methodT();
  }
}
