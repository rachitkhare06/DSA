import java.util.*;
  
  public class Fibtilln{
  
  public static void printfib(int n)
  {
      int a=0;
      int b=1;
      int c=a+b;
      System.out.println(a);
      System.out.println(b);
      n-=2;
      a=b;
      b=c;
      while(n!=0)
      {
          System.out.println(c);
          c=a+b;
          a=b;
          b=c;
          n--;
          
      }
  }
  public static void main(String[] args) {
      // write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      printfib(n);
   }
  }