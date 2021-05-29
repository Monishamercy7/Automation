package Monu;

import java.util.Scanner;

public class reversingString 
{
	private static final char[] S = null;
	//static String Ab="";
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	 String Ab="";
	System.out.println("enter the string to be replaced");
	String str=Sc.next();
	for(int i=str.length()-1;i>=0;i--)
	{
	Ab=Ab+str.charAt(i);
	}
	System.out.println(Ab);

}
}
