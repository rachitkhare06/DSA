import java.io.*;
import java.util.*;

public class maximum {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println(maxOfArray(ar,n-1));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==0)
        return arr[0];
        int t=maxOfArray(arr,idx-1);
        if(arr[idx]<t)
        {
            return t;
        }
        else
        {
            return arr[idx];
        }
        
    }

}