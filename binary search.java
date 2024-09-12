import java.util.*;
class Binary
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n = sc.nextInt();
    System.out.println("enter the elements in ascending order");
    int []a = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }
    int min=0;
    int max=n-1;
    int mid=-1;
    int found=0;
    System.out.println("enter the element to be searched");
    int key = sc.nextInt();
    while(min<=max)
    {
      mid = (min+max)/2;
      if(a[mid] == key)
      {
        found ++;
        break;
      }
      else if(key<a[mid])
      {
        max = mid-1;
      }
      else
      {
        min = mid+1;
      }
    }
    if(found==1)
    {
      System.out.println("key is found at index : " +mid);
    }
    else
    {
      System.out.println("key is not found");
    }
  }
}
