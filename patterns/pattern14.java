import java.util.*;

public class pattern14{
public static void pattern14(int n)
{
    for(int i=1;i<=10;i++)
    {
        System.out.println(n+" * "+i+" = "+n*i);
    }
}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
int n=scn.nextInt();
pattern14(n);
    }
}