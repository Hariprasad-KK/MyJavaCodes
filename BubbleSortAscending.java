import java.util.*;
public class BubbleSortAscending
{
    public static void main(String[]args)
    {
        int n,swap;
        Scanner S=new Scanner(System.in);
        System.out.println("input the number of intergers to sort:");
        n=S.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=S.nextInt();
        }
        for(int i=0;i<(n);i++)
        {
            for(int j=0;j<(n-i-1);j++)
            {
                if(array[j]>array[j+1])
                {
                    swap=array[j];
                    array[j]=array[j+1];
                    array[j+1]=swap;
                }
            }
        }
        System.out.println("sorted list of numbers:");
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+",");
        }
    }
}
        
       