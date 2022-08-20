import java.io.*;
import java.util.*;

public class stringcompression{

	public static String compression1(String s){
		// write your code here
		String str=""+s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                continue;
            }
            else 
            str=str+s.charAt(i);
        }
        
		return str;
	}

	public static String compression2(String s){
		
		String str="";
		int count=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else 
            {
            str=str+s.charAt(i-1)+(count>=1?(count+1):"");
            count=0;
            }
        }
        str=str+s.charAt(s.length()-1)+(count>=1?(count+1):"");
        
		return str;
	
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}