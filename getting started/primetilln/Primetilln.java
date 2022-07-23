import java.util.*;

public class Primetilln{
    public static boolean isPrime(int num)
  {
      for(int i=2;i*i<=num;i++)
      {
          if(num%i==0)
          {
              return false;
          }
      }
      return true;
  }
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int lo=sc.nextInt();
        int hi=sc.nextInt();
        for(int i=lo;i<=hi;i++)
        
        {
            if(isPrime(i)==true)
            {
                System.out.println(i);
            }
        }
    }
}