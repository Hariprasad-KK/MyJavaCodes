import java.util.*;
public class MatrixChainMul
{
  static char name;
  static void printFormat(int i, int j,
                               int n, int[][] brac)
  {
 
    if (i == j)
    {
      System.out.print(name++);
      return;
    }
    System.out.print("(");

    printFormat(i, brac[i][j], n, brac);

    printFormat(brac[i][j] + 1, j, n, brac);
    System.out.print(")");
  }

  static void matrixChainOrder(int p[], int n)
  {

    int[][] m = new int[n][n];

    int[][] brac = new int[n][n];
 
    for (int i = 1; i < n; i++)
      m[i][i] = 0;
 
    for (int L = 2; L < n; L++)
    {
      for (int i = 1; i < n - L + 1; i++)
      {
        int j = i + L - 1;
        m[i][j] = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++)
        {
 
          int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
          if (q < m[i][j])
          {
            m[i][j] = q;

            brac[i][j] = k;
          }
        }
      }
    }

    name = 'A';
    System.out.print("Obtained Optimal Parenthesization: ");
    printFormat(1, n - 1, n, brac);
    System.out.print("\nOptimal Cost is: " + m[1][n - 1]);
  }
 
  public static void main(String[] args)
  {
   Scanner in=new Scanner(System.in);
      System.out.print("Give number of matrices: ");
      int a=in.nextInt();
    int array[] = new int[a+1];
    System.out.println("Give dimensions of matrices ");
    for(int i=0;i<a+1;i++)
    {
     array[i]=in.nextInt();
    }
    int n = array.length;
    matrixChainOrder(array, n);
  }
}