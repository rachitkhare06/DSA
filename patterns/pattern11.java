import java.util.*;

public class pattern11{
public static void pattern1(int n)
{
    
    int nst=1;int count=1;
    for(int r=1;r<=n;r++)
    {
        
       
        for(int cst=1;cst<=nst;cst++)
        {
            System.out.print((count++)+"	");
        }
        nst++;
        System.out.println();
        
    }}
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    pattern1(n);
        // write ur code here

    }
}