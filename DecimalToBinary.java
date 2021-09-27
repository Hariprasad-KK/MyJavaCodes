import java.util.*;
public class DecimalToBinary
{
    public static void main(String[]args)
    {
        int num,counter=0;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter any integer: ");
        num=Sc.nextInt();
        int binaryVal[]=new int[32];
        while(num>0)
        {
            binaryVal[counter++]=num%2;
            num=num/2;
        }
        for(int i=counter-1;i>=0;i--)
        {
            System.out.print(binaryVal[i]);
        }
    }
}
          
       