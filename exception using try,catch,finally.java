import java.util.*;
class AE
{
  public static void main(String[]args)
  {
    try
    {
      int a = 10;
      System.out.println(a/10);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    finally
    {
      System.out.println("finally block has arrived");
    }
  }
}
