import java.util.*;
class  YearDayCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Minuts:");
        long min=sc.nextLong();

		float year=(min/(60f*24f))/365f;
		int days=(int)( (double)(year *365 )- ((int)year*365)) ;
		System.out.println("year :"+ (int)year);
        System.out.println("Days :"+days);
         
	}
}
