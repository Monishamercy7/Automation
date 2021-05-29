package Monu;

import java.util.Scanner;

public class removingspeialcharacter
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string");
	String a=s.next();
	String b="";
	//System.out.println(a.charAt(0));
	
	for(int i=0;i<a.length();i++)
	{
		
		int c=a.charAt(i);
	    
	if(!(c<=64||c>122))
	{
		b=b+a.charAt(i);	
		}
	}
	System.out.println(b);
}
}

