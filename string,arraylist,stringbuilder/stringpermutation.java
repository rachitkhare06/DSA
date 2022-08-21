import java.util.*;
public class stringpermutation {
    public static void solution(String str){
		// write your code here
		
		int p=1;
		for(int i=1;i<=str.length();i++)
		{
		    p*=i;
		}
		for(int i=0;i<p;i++)
		{
		    StringBuilder s=new StringBuilder(str);
		    int t=str.length();
		    int temp=i;
		    while(t!=0)
		    {
		        int rem=temp%t;
		        temp=temp/t;
		        System.out.print(s.charAt(rem));
		        s.delete(rem,rem+1);
		        t--;
		    }
		    System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
