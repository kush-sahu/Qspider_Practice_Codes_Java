import java.util.Scanner;
class ParameterOfCircle{
	public static void main(String [] args) 
	{
        Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Radius :");
        int radius=sc.nextInt();
        final int pi=22/7;
		int perameter=2*pi*radius*radius;
		System.out.println("Perameter of the cirlce is :"+perameter);
	}
}
