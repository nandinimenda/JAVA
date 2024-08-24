public class MOL
{
  void mul(int a,int b)
  {
    System.out.println("Mul is" +(a*b));
  }
  void mul(int a,int b,int c)
  {
    System.out.println("Mul is" +(a*b*c));
  }
  public static void main(String[]args)
  {
    MOL obj = new MOL();
    obj.mul(4,5);
    obj.mul(4,5,6);
  }
}
