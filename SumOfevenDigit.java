import java.util.Scanner;
class SumOfevenDigit 
{
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.print("Eneter Num:");
		int num=sc.nextInt();

		int sum=0;

		while(num!=0){
			int rem=num%10;
			if(rem%2==0)sum+=rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
