package Graphics;
import java.util.Scanner;


public class triangle implements interface1{

     Scanner sc =new Scanner(System.in);
     int l,b;
	
	public void area()
	{
		System.out.println("Enter Length");
		l=sc.nextInt();
		System.out.println("Enter Breadth");
		b=sc.nextInt();
		System.out.println("Area of Triangle is: "+(l*b)/2);
	}
}