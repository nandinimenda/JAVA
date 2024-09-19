class Employee
{
  final void display()
  {
    System.out.println("Hii");
  }
}
class Developer extends Employee
{
   void display()
   {
     System.out.println("Hello");
   }
}
class finalDemo
{
  public static void main(String[]args)
  {
    Developer obj = new Developer();
    obj.display();
  }
}
