import java.util.*;

public class pattern15{
public static void pattern15(int n)
{
    int nsp=n/2;
    int nst=1;
    for(int r=1;r<=n;r++)
    {
        int count=(r<=(n+1)/2)?r:n-r+1;
        for(int csp=1;csp<=nsp;csp++)
        {
            System.out.print("	");
        }
        for(int cst=1;cst<=nst;cst++)
        {
            if(cst<=nst/2)
            {
                System.out.print((count++)+"	");
            }
            else
            System.out.print((count--)+"	");
            
        }
        if(r<=n/2)
        {
            nsp-=1;
            nst+=2;
        }
        else
        {
            nsp+=1;
            nst-=2;
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

    int n=scn.nextInt();
    pattern15(n);

    }
}