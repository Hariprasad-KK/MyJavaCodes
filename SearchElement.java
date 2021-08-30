import java.util.*;
public class SearchElement
{
    public static void main(String[]args)
    {
        int n;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        n=S.nextInt();
        int a[]= new int[n];
        System.out.println("Input the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
        }
        int ele =S.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==ele)
            {
                System.out.println("Element found");
            }
        }
    }
}
         
    