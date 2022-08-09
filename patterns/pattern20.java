import java.util.*;

public class pattern20{
public static void pattern20(int n)
{
for(int r=1;r<=n;r++)
{
    for(int cst=1;cst<=n;cst++)
    {
        if(cst==1 || cst==n)
        System.out.print("*	");
        else if(r>n/2 && (cst==r || (cst+r)==n+1))
        System.out.print("*	");
        else
        {
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