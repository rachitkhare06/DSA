import java.io.*;
import java.util.*;

public class removeprimes{
    public static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

	public static void solution(ArrayList<Integer> al){
		// write your code here
		int val;
		
		for(int i=0;i<al.size();i++)
		{
		    val=al.get(i);
		    boolean t=isPrime(val);
		    if(t)
		    {
		        al.remove(i);
		        i=i-1;
		    }
		    else
		    continue;
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}