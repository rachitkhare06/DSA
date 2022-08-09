import java.util.*;
    
    public class gcdlcm{
    public static int gcd(int a,int b)
    {
        int gcd=1;
        for(int i=2;i<=Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
    public static int lcm(int a,int b)
    {
        int lcm=a*b;
        for(int i=Math.max(a,b);i<=(a*b);i++)
        {
            if(i%a==0 && i%b==0)
            {
                lcm=i;break;
            }
        }
        return lcm;
    }
    public static void main(String[] args) {
      // write your code here  
      Scanner scn=new Scanner(System.in);
      
      int a=scn.nextInt();
      int b=scn.nextInt();
      System.out.println(gcd(a,b));
      System.out.println(lcm(a,b));
     }
    }