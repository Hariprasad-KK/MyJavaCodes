import java.util.*;
class Sum2D
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the row size");
int row=scan.nextInt();
System.out.println("Enter the column size");
int col=scan.nextInt();
int a[][]=new int[row][col];
int b[][]=new int[row][col];
System.out.println("Enter the first array values");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
a[i][j]=scan.nextInt();
}
}
System.out.println("Enter the second array values");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
b[i][j]=scan.nextInt();
}
}
System.out.println("Sum of two square matrix");
int c[][]=new int[row][col];
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}