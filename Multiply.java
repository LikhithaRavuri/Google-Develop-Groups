import java.util.*;
class Multiplication
{
   public static void main(String args[])
   {
       int r1,c1,r2,c2,i,j,k,sum=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter row & col size of first matrix");
       r1=sc.nextInt();
       c1=sc.nextInt();
       int a[][] = new int[r1][c1];
       System.out.println("Enter elements of first matrix");
       for(i=0;i<r1;i++)
       {
        for(j=0;j<c1;j++)
        {
            a[i][j]=sc.nextInt();
        }
       }
       System.out.println("Enter row & col size of second matrix");
       r2=sc.nextInt();
       c2=sc.nextInt();
       int b[][] = new int[r2][c2];
       System.out.println("Enter elements of second matrix");
       for(i=0;i<r2;i++)
       {
        for(j=0;j<c2;j++)
        {
            b[i][j]=sc.nextInt();
        }
       }
        int c[][] = new int[r1][c2];
       if(c1!=r2)
         System.out.println("Multiplication is not possible");
       else 
       {
         
          for(i=0;i<r1;i++)
          {
            for(j=0;j<c2;j++)
            {
               
                for(k=0;k<=c2;k++)
                {
                    sum=sum+a[i][k]*b[k][j];
                }
                c[i][j]=sum;
                sum=0;
            }
          }
       }
       System.out.println("Resultant matrix is:");
       for(i=0;i<r1;i++)
       {
        for(j=0;j<c2;j++)
        {
            System.out.print(c[i][j] + " ");
        }
        System.out.println();
       }
   }
}