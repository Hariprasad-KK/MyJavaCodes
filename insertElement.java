import java.util.*;
public class insertElement
{
    public static void main (String[]args)
    {
        int n,pos,x;
        Scanner S =new Scanner(System.in);
        System.out.println("enter the number of elements in the array :");
        n=S.nextInt();
        int a[]=new int[n+1];
        System.out.println("enter all elements in the array :");
        for(int i=0 ; i<n ;i++)
        {
            a[i]=S.nextInt();
        }
        System.out.println("Enter the position to insert :");
        pos=S.nextInt();
        System.out.print("enter the element to be inserted :");
        x = S.nextInt();
        for(int j=(n-1) ; j>(pos-1) ; j--)
       {
           a[j+1]=a[j];
        } 
        a[pos-1]=x;
        for(int k=0;k<n;k++)
        {
            System.out.println(a[k]);
        }
        System.out.println(a[n]);
    }
}
        
            
        