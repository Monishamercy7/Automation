package Monu;

import java.util.ArrayList;

public class sm {
	static ArrayList a=new ArrayList();
	static ArrayList b=new ArrayList();
	
	public static void fruits()
	{
		a.add("id ;"+1);
		a.add("name ;"+"apple");
		a.add("price ;"+100.00);
		for(int i=0; i<a.size();i++)
		{
		System.out.println(a.get(i));
		}
	}
	public static void fruits1()
	{
		b.add("id :"+2);
		b.add("name "+"mango");
		b.add("price ;"+100.00);
		for(int i=0; i<a.size();i++)
		{
		System.out.println(b.get(i));
		}
		
	}
	public static void main(String[] args) 
	{
		fruits();
		fruits1();
	

		
	}

}
