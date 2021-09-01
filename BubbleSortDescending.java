import java.util.*;
public class BubbleSortDescending
{
    public static void main(String[]args)
    {
        int n,swap;
        Scanner S=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        n=S.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements in the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<(n-i-1);j++)

            {
               if(a[j]<a[j+1])
               {
                   swap=a[j];
                   a[j]=a[j+1];
                   a[j+1]=swap;
                }
            }
        }
        System.out.println("after sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
        }
    }
    
}