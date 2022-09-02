
import java.util.*;

public class maximum{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println(maxOfArray(ar,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1)
        return arr[arr.length-1];
        if(arr[idx]>arr[idx+1])
        {
            int t=arr[idx];
            arr[idx]=arr[idx+1];
            arr[idx+1]=t;
        }
        return maxOfArray(arr,idx+1);
        
    }

}