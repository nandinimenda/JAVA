import java.util.*;
class Program
{
  static void display()
  {
    System.out.println("you entered a static method");
  }
  int add(int a,int b)
  {
    return(a+b);
  }
  public static void main(String[]args)
  {
    display();
    Program pro = new Program();
    int sum = pro.add(4,8);
    System.out.println("Addition:" +sum);
  }
}
