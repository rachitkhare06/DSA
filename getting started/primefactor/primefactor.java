import java.util.*;

public class primefactor{
public static void pf(int n)
{
    for(int i=2;i*i<=n;i++)
    {
        while(n%i==0)
        {
            System.out.print(i+" ");
            n/=i;
        }
    }
    if(n!=1)
    {
        System.out.print(n);
    }
}
public static void main(String[] args) {
  // write your code here 
   Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    pf(n);
 }
}