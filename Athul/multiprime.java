import java.util.Scanner;
class multi extends Thread
{
	int i;
	public void run()
	{
		System.out.println("Multiplication Table : 10:");
		for(i=1;i<=10;i++)
		{
			System.out.println("10x"+i+"="+(i*10));
		}
	}
}
class prime extends Thread
{
	int n,f=0,i=2;
	Scanner sn=new Scanner(System.in);
	prime()
	{
		System.out.println("Enter limit:");
		n=sn.nextInt();
		
	}
	public void run()
	{
		System.out.println("Prime Numbers:");
		for(int i=2;i<=n;i++)
     {
         int c=0;
         for(int j=1;j<=i;j++)
         {
        	     if(i%j==0)
        	     {
        	         c++;
        	     }
         }
         
       if(c==2){
       	System.out.print(i+" ");}
		}
	}

}
class multiprime{
	public static void main(String[] args)
	 {
		multi m=new multi();
		prime p=new prime();
		
		
			m.start();
		p.start();
		
	
		
	}
}