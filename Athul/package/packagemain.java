import java.util.Scanner;
import Graphics.circle;
import Graphics.rectangle;
import Graphics.square;
import Graphics.triangle;
import Graphics.interface1;

public class packagemain
{
public static void main (String args[])
{
    int op;
    Scanner sc =new Scanner(System.in);
    System.out.println("\n MENU \n 1.CIRCLE \n 2.RECTANGLE \n 3.Square \n 4.triangle");
    do{
        System.out.println("\n Choose an option: ");
        op=sc.nextInt();
        switch(op)
        {
            case 1:
            circle ob =new circle();
            ob.area();
            break;
            case 2:
            rectangle ob1= new rectangle();
            ob1.area();
            break;
            case 3:
            square ob2 =new square();
            ob2.area();
            break;
            case 4:
            triangle ob3 =new triangle();
            ob3.area();
            break;
            default:
            System.out.println("invalid option");
        }
    }while(op<=4);
}
}