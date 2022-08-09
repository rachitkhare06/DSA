import java.util.*;

public class inverse{
    public static void inverse(int n)
    {
        int lastindex=1;int r=0;
        while(n!=0)
        {
            int d=n%10;
            r=r+lastindex*((int)Math.pow(10,d-1));
            lastindex++;
            n=n/10;
        }
        System.out.println(r);
    }

public static void main(String[] args) {
  // write your code here  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  inverse(n);
 }
}