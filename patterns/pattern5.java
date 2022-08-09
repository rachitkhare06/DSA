import java.util.*;

public class pattern5{
public static void pattern1(int n)
{
    int nst=1;
    int nsp=(n-1)/2;
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
        if(r<=n/2)
        {nsp--;
        nst+=2;}
        else
        {
            nsp++;
            nst-=2;
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