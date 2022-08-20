import java.io.*;
import java.util.*;

public class toggle {

	public static String toggleCase(String str){
	    StringBuilder s=new StringBuilder();
	    char c;
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    if(ch>='A' && ch<='Z')
		    {
		        c=(char)(ch-'A'+'a');
		        s.append(c);
		    }
		    else
		    {
		        c=(char)(ch-'a'+'A');
		        s.append(c);
		    }
		}
		return s.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}