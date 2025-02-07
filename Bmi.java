import java.util.*;
class Bmi 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Ebter weight:");
        float weight=sc.nextFloat();
		System.out.print("Ebter height:");
        float height=sc.nextFloat();


		double ans=(double)(weight*(0.45359237f))/ (double)((0.0254 * height) * (0.0254*height));
		
		
		System.out.println("BMI is:"+ ans);
	}
}
