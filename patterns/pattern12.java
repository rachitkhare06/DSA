import java.util.*;

public class pattern12{
    public static void pattern(int n)
    {
        int a=0,b=1;

        int nst=1;
        
        
        for(int r=1;r<=n;r++)
        {
            for(int cst=1;cst<=nst;cst++)
            {
               System.out.print(a+"	");
               int sum=a+b;
               a=b;
               b=sum;
                
            }

            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        pattern(n);

    }
}