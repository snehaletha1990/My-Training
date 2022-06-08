import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		int n1,n2,count;
		n1=0;
		n2=1;
		Scanner r=new Scanner(System.in);
		System.out.println("enter the count");
		count=r.nextInt();
		System.out.print(n1 +" " + n2);
		for(int i=2; i<=count; i++)
		{
			int n3=n1+n2;
			System.out.print( " " + n3);
			n1=n2;
			n2=n3;
		}
	}
}