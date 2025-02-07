import java.util.Scanner;
class PrimeOrNot 
{
	public static void main(String[] args) 
	{ 
        Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println((num==2 || num==3)?(num +"is prime number"):((num%2==0 || num%3==0)?(num+"is not prime"):(num+"is prime")));
	}
}
