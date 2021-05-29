package Monu;


public class Demo {

static int x=10;
static int y=20;

public static void m1()
{
System.out.println("Inside m1");	

}

public static void main(String[]arg)
{
	System.out.println("Main Method Started");
	System.out.println("X="+Demo.x);
	System.out.println("Y="+Demo.y);
	Demo.m1();
	System.out.println("Main Method Ended");
}


}
