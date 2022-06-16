import java.util.Scanner;

class evenornot implements Runnable
{
	int n;
	Scanner sn=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter n for even numbers:");
		n=sn.nextInt();
		System.out.println("Even Numbers:");
		for (int i=1;i<=n;i++) {
			if(i%2==0)
			{
				System.out.print(" "+i);
			}
		}
		System.out.println("\n---------------------");
	}
}

class fiba implements Runnable
{
	
	Scanner sn=new Scanner(System.in);
	public void run()
	
    {
        int num1 = 0, num2 = 1,N;
  
        int counter = 0;
        System.out.println("Enter limit:");
        N=sn.nextInt();
  
        
        while (counter < N) {
  
            System.out.print(num1 + " ");
  
            
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
  
   

}
class fib{
	public static void main(String[] args) 
	{
		evenornot or=new evenornot();
		fiba f1=new fiba();
		Thread t1=new Thread(or);
		Thread t2=new Thread(f1);
		t1.start();
		t2.start();
	}
}