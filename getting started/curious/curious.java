import java.util.*;
  
  public class curious{
  public static void curious(int a)
  {
      for(int i=1;i*i<=a;i++)
      {
          System.out.println((i*i)+" ");
      }
  }
  public static void main(String[] args) {
    // write your code here  
     Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    curious(n);
   }
  }