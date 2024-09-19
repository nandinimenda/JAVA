final class Employee
{
  int salary = 10000;
}
class Developer extends Employee
{
  void shows()
  {
    System.out.println("Hii");
  }
}
class finalDemo
{
  public static void main(String[]args)
  {
    Developer obj = new Developer();
    obj.shows();
  }
