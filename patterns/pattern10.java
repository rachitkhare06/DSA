import java.util.*;

public class pattern10 {
public static void pattern1(int n)
{
    
    int nsp1=n/2;
    int nsp2=-1;
    for(int r=1;r<=n;r++)
    {
       
         for(int csp=1;csp<=nsp1;csp++)
        {
            System.out.print("	");
        }
        
            System.out.print("*	");
        
       
        for(int csp=1;csp<=nsp2;csp++)
        {
            System.out.print("	");
        }
        
        if(r!=1 && r!=n)
            System.out.print("*	");
        
        if(r<=n/2)
        {nsp1--;
        
          nsp2+=2;  
        }
        else
        {
            nsp1++;
            nsp2-=2;
            
        }
        System.out.println();
        
    }}
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    pattern1(n);
        // write ur code here

    }
}