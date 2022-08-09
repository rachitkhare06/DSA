import java.util.*;
   
   public class rotate{
    public static int countdigits(int n)
  {
      int c=0;
      while(n!=0)
      {
          c++;
          n=n/10;
      }
      return c;
  }
   public static void main(String[] args) {
     // write your code here  
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     
     int len=countdigits(n);
     k=(k%len+len)%len;
     int a=n%((int)Math.pow(10,k));
     int b=n/((int)Math.pow(10,k));
     System.out.println(a*((int)Math.pow(10,len-k))+b);
    }
   }