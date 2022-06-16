import java.util.Scanner;
import Arithmetic.Addition;
import Arithmetic.Substraction;
import Arithmetic.Multiplication;
import Arithmetic.division;
import Arithmetic.interface2;

public class Arithmetic
{
public static void main (String args[])
{
    int op;
    Scanner sc =new Scanner(System.in);
    System.out.println("\n Enter two values A,B: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    do{
        System.out.println("\n MENU \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.division");
        System.out.println("\n Choose an option: ");
        op=sc.nextInt();
        switch(op)
        {
            case 1:
            Addition ob =new Addition();
            ob.operation(a,b);
            break;
            case 2:
            Substraction ob1= new Substraction();
            ob1.operation(a,b);
            break;
            case 3:
            Multiplication ob2 =new Multiplication();
            ob2.operation(a,b);
            break;
            case 4:
            division ob3= new division();
            ob3.operation(a,b);
            break;
            default:
            System.out.println("invalid option");
        }
    }while(op<=4);
}
}