import java.util.*;

public class pattern18{
public static void pattern18(int n)
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
            if(r<=n/2 && r>1 && cst>1 && cst<nst) 
            System.out.print("	");
            else
            {
                System.out.print("*	");
            }
        }
        if(r<=n/2)
        {
            nsp++;
            nst-=2;
        }
        else
        {
            nsp--;
            nst+=2;
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     pattern18(n);

 }
}