class Employ
{
  float salary = 10000.0f;
}
class HR extends Employ
{
  float salary = 20000.0f;
  void display()
  {
    System.out.println("salary is " +super.salary);
  }
  public static void main(String[]args)
  {
    HR obj = new HR();
    obj.display();
  }
}
