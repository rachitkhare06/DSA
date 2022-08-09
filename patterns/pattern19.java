import java.util.*;

public class pattern19{
public static void pattern20(int n)
{
for(int r=1;r<=n;r++)
{
    for(int cst=1;cst<=n;cst++)
    {
        if(r==1)
        {
            if(cst<=(n+1)/2 || cst==n )
            {
                System.out.print("*	");
            }
            else
            {
                System.out.print("	");
            }
        }
        else if(r<=n/2)
        {
            if(cst==n || cst==n/2+1)
            {
                System.out.print("*	");
            }
            else
            {
                System.out.print("	");
            }
        }
        else if(r==n/2+1)
        {
            System.out.print("*	");
        }
        else if(r<n)
        {
            if(cst==1 || cst==n/2+1)
            System.out.print("*	");
            else
            {
                System.out.print("	");
            }
        }
        else
        {
            if(cst==1 || cst>n/2)
            {
                System.out.print("*	");
            }
            else
            System.out.print("	");
        }
    }
    System.out.println();
}
}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
int n=scn.nextInt();
pattern20(n);
    }
}