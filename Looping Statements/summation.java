import java.util.Scanner;
class summation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter first number");
		int m = sc.nextInt();
		System.out.println("Please enter second number");
		int n = sc.nextInt();
		int temp = 0,x;
		do
		{
			x= m+temp;
			temp = x;
			m++;
		}
		while (m<=n);
					System.out.println(x);
	}
}
