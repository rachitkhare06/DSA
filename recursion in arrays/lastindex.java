import java.io.*;
import java.util.*;

public class lastindex{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(firstIndex(ar,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
       if(idx==arr.length)
       {
           return -1;
       }
       int t=firstIndex(arr,idx+1,x);
       if(t==-1)
       {
       if(arr[idx]==x)
       {
           return idx;
       }
       else
       {
           return t;
       }
       }
       return t;
    }

}