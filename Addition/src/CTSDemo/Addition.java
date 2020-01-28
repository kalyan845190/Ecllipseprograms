package CTSDemo;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	int a,b,c;
	System.out.print("enter a value: " );
	a=sc.nextInt();
	System.out.print("enter a value: " );
	b=sc.nextInt();
	sc.close();
	c=a+b;
	System.out.println("addition is: " +c);
	}

}
