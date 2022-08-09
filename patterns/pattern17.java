import java.util.*;

public class pattern17{
public static void pattern17(int n)
{
    int nsp=n/2;
    int nst=1;
    for(int r=1;r<=n;r++)
    {
        if(r!=((n+1)/2))
        
        {
            for(int csp=1;csp<=nsp;csp++)
            {
                System.out.print("	");
            }
            
        }
        else
        {
            for(int cst=1;cst<=(nst-1);cst++)
            {
                System.out.print("*	");
            }
        }
        for(int cst=1;cst<=nst;cst++)
            {
                System.out.print("*	");
            }
        System.out.println();
        if(r<=n/2)
        nst++;
        else
        nst--;
    
    }
}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        pattern17(n);

    }
}