import java.util.*;
class BIE
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
      System.out.println("Arithmetic Exception");
    }
    try
    {
      int arr[] = new int[4];
      System.out.println(arr[5]);
    }
    catch(Exception e)
    {
      System.out.println("Array index out of bounds");
    }
    try
    {
      String str = null;
      System.out.println(str.length());
    }
    catch(NullPointerException npe)
    {
      System.out.println(npe);
    }
  }
} 
