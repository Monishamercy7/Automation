package Monu;

import java.util.Scanner;

public class splitting
{
public static void main(String[] args)
{
	//Scanner Sc=new Scanner(System.in);
	//System.out.println("enter the String");
	String str="like like rcb";
     String[] Spl = str.split(" ");
	int count=0;
	for(int i=0;i<Spl.length;i++)
	{
		if(Spl[i].equals("like"))
		{
		count++;
		}
	}
	System.out.println("number of like present in given String are "+count);
}
}
