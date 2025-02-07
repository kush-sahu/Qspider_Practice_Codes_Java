import java.util.*;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Ebter radius:");
        int r=sc.nextInt();

		final float pi=22/7;
		float ans=pi * r*r;
		System.out.println("the area if rectangle is:"+ ans);
	}
}
