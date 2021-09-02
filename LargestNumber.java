import java.util.*;
public class LargestNumber
{
    public static void main(String[]args)
    {
        int n; int max;
        Scanner S=new Scanner(System.in);
        System.out.println("enter the number of elements in the array:");
        n=S.nextInt();
        int a[]=new int[n];
        System.out.println("elements in the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
        }
        max=a[0];
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.print("Largest Number in the array:"+max);
    }
}
      
    
      