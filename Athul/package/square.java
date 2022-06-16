package Graphics;
import java.util.Scanner;

public class square implements interface1{

     Scanner sc =new Scanner(System.in);
     int l;
	
	public void area()
	{
		System.out.println("Enter Length");
		l=sc.nextInt();
		System.out.println("Area of Square is: "+l*l);
	}
}