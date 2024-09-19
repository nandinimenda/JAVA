import java.util.*;
class N
{
  public void methodN()
  {
     System.out.println("class N");
  }
}
class V extends N
{
   public void methodV()
   {
      System.out.println("class V");
   }
}
class D extends V
{
   public void methodD()
   {
      System.out.println("class D");
   }
   public static void main(String[]args)
   {
      D obj = new D();
      obj.methodN();
      obj.methodV();
      obj.methodD();
   }
}
      
