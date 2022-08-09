import java.util.*;

public class pattern16{
public static void pattern16(int n)
{
    int nsp=n*2-3;
    int nst=1;
    int count=1;
    for(int r=1;r<=n;r++)
    {
        for(int cst=1;cst<=nst;cst++)
        {
            System.out.print((count++)+"	");
        }
        for(int csp=1;csp<=nsp;csp++)
        {
            System.out.print("	");
        }
        if(nst==n)
            {
            --count;nst--;
            }
        for(int cst=1;cst<=nst;cst++)
        {
            System.out.print((--count)+"	");
        }
        nst++;
        nsp-=2;
        System.out.println();
    }
}
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     pattern16(n);

 }
}