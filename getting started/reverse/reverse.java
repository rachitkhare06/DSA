import java.util.*;
   
   public class reverse{
   public static void reverse(int n)
   {
       int a;
       while(n!=0)
       {
           a=n%10;
           System.out.println(a);
           n=n/10;
       }
       
   }
    public static void main(String[] args) {
    // write your code here  
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    reverse(n);
   }
  }