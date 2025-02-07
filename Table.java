import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.print("Enter the range:");
		int r=sc.nextInt();

		for(int i=1;i<=r;i++)
		{
			System.out.println(num+"X"+i+"="+ (num*i));
		}
}
}
