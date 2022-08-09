import java.util.*;

public class pattern9{

public static void pattern9(int n)
{
    for(int r=1;r<=n;r++)
    {
        for(int c=1;c<=n;c++)
        {
            if((r==c)||(r+c==n+1))
            {
                System.out.print("*	");
            }
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
        pattern9(n);

    }
}