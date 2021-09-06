import java.util.*;
public class LargestTwoNumbers
{
    public static void main(String[]args)
    {
        int n,max1,max2,temp;
        Scanner S = new Scanner(System.in);
        System.out.println("enter the number of elements in the array:");
        n=S.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements in the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
        }
        max1=a[0];
        max2=a[1];
        if(max1<max2)
            {
               temp=max1;
               max1=max2;
               max2=temp;
            }
        for(int i=2;i<n;i++)
        {
            if(a[i]>max1)
            {
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2&&a[i]<max1)
            {
                max2=a[i];
            }
        }
        System.out.println("the first largest:"+max1);
        System.out.println("the second largest:"+max2);
    }
}
               
               
        
       