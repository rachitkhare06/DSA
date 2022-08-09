import java.util.*;
  
  public class count{
  
  public static void countdigits(int n)
  {
      int c=0;
      while(n!=0)
      {
          c++;
          n=n/10;
      }
      System.out.println(c);
  }
  public static void main(String[] args) {
    // write your code here  
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    countdigits(n);
   }
  }