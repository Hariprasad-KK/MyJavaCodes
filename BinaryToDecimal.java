import java.util.*;
public class BinaryToDecimal
{
    public static void main(String[]args)
    {
       
        Scanner sc=new Scanner(System.in);
        long BN, DN=0,j=1,rem;
        System.out.println("Input a binary number:");
        BN=sc.nextLong();
        
        while(BN!=0)
        {
            rem=BN%10;
            DN=DN+(rem*j);
            j=j*2;
            BN=BN/10;
        }
        System.out.println("DECIMAL NUMBER:"+DN);
     }
}
