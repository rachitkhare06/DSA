import java.util.*;
    
    public class digits{
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
        public static void digits(int n)
        {
            int l=countdigits(n);
            while(l!=0)
            {
                int p=n/((int)Math.pow(10,l-1));
    
                System.out.println(p);
                n=n%((int)Math.pow(10,l-1));
                                l--;
            }
        }
    
     public static void main(String[] args) {
    // write your code here  
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    digits(n);
   }
    }