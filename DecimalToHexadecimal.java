import java.util.*;
class DecimalToHexadecimal
{
    public static void main(String[]args)
    {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the decimal number:");
        num=in.nextInt();
        int rem;
        String str="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(num>0)
        {
            rem=num%16;
            str=hex[rem]+str;
            num=num/16;
        }
        System.out.println("Decimal to Hexadecimal :"+str);
    }
}
        
          