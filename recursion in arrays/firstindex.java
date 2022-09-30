import java.io.*;
import java.util.*;

public class firstindex{

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
        
        return ((idx==arr.length)?-1:(arr[idx]==x)?idx:firstIndex(arr,idx+1,x));
    }

}