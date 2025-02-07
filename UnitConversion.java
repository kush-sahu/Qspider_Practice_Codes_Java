import java.util.Scanner;
class UnitConversion 
{
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Your Temperature in Celsius:");
		double cel=sc.nextDouble();

        double fr=cel*(9d/5d)+32;
		System.out.print("Temperature in Fahrenheat is :"+fr);

	}
}
