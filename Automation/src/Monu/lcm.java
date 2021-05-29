package Monu;

import java.util.Scanner;

public class lcm 
{
 static	int n ;
	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
//int n = 0;
System.out.println("enter the numbers");
int a=s.nextInt();
int b=s.nextInt();
for(int i=1;i<=a&&i<=b;i++)
{
	if(a%i==0&&b%i==0)
	{
		n=i;
	}
	//int lcm=(a*b)/n;
	//System.out.println("lcm of numbers "+lcm);
}
int lcm=(a*b)/n;
System.out.println("lcm of numbers "+lcm);
}
}