package pack;
public class PackageDemo
{
  public void show()
  {
    System.out.println("User defined packages");
  }
}



import pack.PackageDemo;
class A
{
  public static void main(String[]args)
  {
    PackageDemo obj = new PackageDemo();
    obj.show();
  }
}
