package Monu;

import java.util.Scanner;

public class polindrome 
{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
String a,b="";
String str=Sc.next();
a=str;
for(int i=str.length()-1;i>=0;i--)
{
	b=b+str.charAt(i);
}
//if(a.equalsIgnoreCase(b))
if(a.equals(b))
{
	System.out.println("polindrome");
}else
{
	System.out.println("not a polindrome");
}
}
}
