import java.io.*;
import java.util.*;

public class palindromicsubstring{
    public static String reverse(String s)
    {
        String a="";
        for(int i=0;i<s.length();i++)
        {
            a=s.charAt(i)+a;
        }
        return a;
    }
	public static void solution(String str){
		//write your code here
		String s;
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i+1;j<=str.length();j++)
		    {
		        s=str.substring(i,j);
		        if(s.equals(reverse(s)))
		        {
		            System.out.println(s);
		        }
		    }
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}