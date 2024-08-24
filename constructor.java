import java.util.*;
class student
{
  String name;
  int rollnum;
  student()
  {
    name = "CSE";
    rollnum = 05;
  }
  student(String str,int n)
  {
    name = str;
    rollnum = n;
  }
  public static void main(String[]args)
  {
    student s1 = new student();
    student s2 = new student("ECE",04);
    System.out.println(s1.name);
    System.out.println(s1.rollnum);
    System.out.println(s2.name);
    System.out.println(s2.rollnum);
  }
}
