import java.util.*;
class Bubble
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n = sc.nextInt();
    System.out.println("enter the elements: ");
    int []a = new int[n];
    int i,j,temp;
    for(i=0;i<n;i++)
    {
       a[i] = sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
       for(j=0;j<n-i-1;j++)
       {
          if(a[j]>a[j+1])
          {
             temp = a[j];
             a[j] = a[j+1];
             a[j+1] = temp;
          }
       }
    }
    System.out.println("elements after sorting: ");
    for(i=0;i<n;i++)
    {
       System.out.println(a[i]);
    }
  }
}
