import java.util.*;

public class pattern8{
public static void pattern1(int n)
{
    
    int nsp=n-1;
    for(int r=1;r<=n;r++)
    {
        
        
        for(int csp=1;csp<=nsp;csp++)
        {
            System.out.print("	");
        }
         System.out.print("*	");
        nsp--;
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