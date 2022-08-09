import java.util.*;

public class pattern6{
public static void pattern1(int n)
{
    int nst=(n+1)/2;
    int nsp=1;
    for(int r=1;r<=n;r++)
    {
        
        for(int cst=1;cst<=nst;cst++)
        {
            System.out.print("*	");
        }
        for(int csp=1;csp<=nsp;csp++)
        {
            System.out.print("	");
        }
        for(int cst=1;cst<=nst;cst++)
        {
            System.out.print("*	");
        }
        if(r<=n/2)
        {nsp+=2;
        nst--;}
        else
        {
            nsp-=2;
            nst++;
        }
        System.out.println();
        
    }
}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    pattern1(n);
        // write ur code here

    }
}