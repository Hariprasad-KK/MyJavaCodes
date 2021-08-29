import java.util.*;
public class DeleteElement
{
    public static void main(String[]args)
    {
        int n,x,flag=0,loc=0;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n=S.nextInt();
        int a[]=new int[n];
        System.out.println("enter all elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
        }
        System.out.println("enter the element you want to delete:");
        x=S.nextInt();
        for(int i=0;i<n;i++)
        {
            if (a[i]==x)
            {
                flag=1;
                loc=i;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
            for(int i=loc+1;i<n;i++)
            {
                a[i-1]=a[i];
            }
            System.out.println("After Deleting:");
            for(int i=0 ;i<n-2;i++)
            {
                System.out.print(a[i]+",");
            }
            System.out.print(a[n-2]);
        }
        
            else
            {
                System.out.println("Element not found:");
            }
        }
    
}
        
    