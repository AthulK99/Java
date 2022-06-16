package Graphics;
import java.util.Scanner;

public class circle implements interface1{
    Scanner sc = new Scanner(System.in);
    double ar,r;
    public void area()
    {
        System.out.println("enter the radius of circle");
        r=sc.nextDouble();
        ar=3.14*r*r;
        System.out.println("area of circle:"+ar);
    }
}