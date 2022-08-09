import java.util.*;

public class pattern4{
public static void pattern1(int n)
{
    int nst=n;
    int nsp=0;
    for(int r=1;r<=n;r++)
    {
        for(int csp=1;csp<=nsp;csp++)
        {
            System.out.print("	");
        }
        for(int cst=1;cst<=nst;cst++)
        {
            System.out.print("*	");
        }
        nsp++;
        nst--;
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