class A
{
  A()
  {
    System.out.println("parent constructor");
  }
}
class B extends A
{
  B()
  {
    super();
    System.out.println("child constructor");
  }
  public static void main(String[]args)
  {
    B obj = new B();
  }
}
