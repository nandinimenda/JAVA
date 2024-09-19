class student
{
  void message()
  {
    System.out.println("parent class");
  }
}
class Faculty extends student
{
  public void message()
  {
    System.out.println("child class");
  }
  void display()
  {
    super.message();
    message();
  }
  public static void main(String[]args)
  {
     Faculty obj = new Faculty();
     obj.display();
  }
}
